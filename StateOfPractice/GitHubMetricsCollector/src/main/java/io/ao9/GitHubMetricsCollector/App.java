package io.ao9.GitHubMetricsCollector;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.*;

public class App {
    private final static String fileName = "GitHub_Metrics_Template.xlsx";
    private final static String sheetName = "Sheet1";
    private final static String gitHubUrl = "https://github.com";
    private final static String gitHubApiUri = "https://api.github.com/graphql";
    private final static String gitHubUsername = "your_GitHub_username";
    // Do NOT commit your token to this git repo
    private final static String gitHubToken = "your_GitHub_token";

    public static void main(String[] args) {

        try {
            FileInputStream fileInput = new FileInputStream(fileName);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            fileInput.close();

            System.out.printf("Reading input data from file '%s'...\n\n", fileName);
            List<String> repoUrls = readInputData(sheet);

            System.out.println("Fetching repo data by GitHub API...\n");
            List<RepoData> repoDataList = fetchRepoData(sheet, repoUrls);

            System.out.println("Preparing output data...\n");
            prepareOutputData(sheet, repoDataList);

            System.out.printf("Writing to file '%s'...\n\n", fileName);
            FileOutputStream fileOutput = new FileOutputStream(fileName);
            workbook.write(fileOutput);
            fileOutput.close();

            System.out.println("Process Done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<String> readInputData(XSSFSheet sheet) {
        /*
         * Read repo urls
         * starting from row 2, col 3 (rownum starts from 0 in the code)
         */
        List<String> repoUrls = new ArrayList<>();
        Iterator<Cell> cellIterator = sheet.getRow(1).cellIterator();
        for (int i = 0; i < 2; i++) cellIterator.next();
        while (cellIterator.hasNext()) {
            String url = cellIterator.next().getStringCellValue();
            if(url.contains(gitHubUrl)) { // if it's a GitHub repo
                repoUrls.add(url);
            } else {
                repoUrls.add(null);
            }
        }

        return repoUrls;
    }

    private static List<RepoData> fetchRepoData(XSSFSheet sheet, List<String> repoUrls) throws IOException, InterruptedException {
        /*
         * fetch repo data from https://api.github.com/graphql
         * using GraphQL API
         */
        final String REQUEST_BODY_TEMPLATE =
                "{" +
                    "\"query\":\"query getRepoData {" +
                        "repository(owner: \\\"%s\\\", name: \\\"%s\\\") {" +
                            "stargazers {" +
                                "totalCount" +
                            "}" +
                            "forks {" +
                                "totalCount" +
                            "}" +
                            "watchers {" +
                                "totalCount" +
                            "}" +
                            "openIssues: issues(states: OPEN) {" +
                                "totalCount" +
                            "}" +
                            "totalIssues: issues {" +
                                "totalCount" +
                            "}" +
                            "openPullRequests: pullRequests(states: OPEN) {" +
                                "totalCount" +
                            "}" +
                            "totalPullRequests: pullRequests {" +
                                "totalCount" +
                            "}" +
                            "createdAt," +
                            "updatedAt" +
                        "}" +
                    "}" +
                "\"}";
        List<RepoData> repoDataList = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        for(String url : repoUrls) {
            if(url != null) {
                String[] strs = url.split("/");
                String repoOwner = strs[3];
                String repoName = strs[4];
                System.out.printf("Retrieving repo data for '%s/%s'...\n", repoOwner, repoName);
                String requestBody = String.format(REQUEST_BODY_TEMPLATE, repoOwner, repoName);

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(gitHubApiUri))
                        .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                        .header("Authorization", basicAuth(gitHubUsername, gitHubToken))
                        .build();
                HttpResponse<String> response = client.send(request,
                        HttpResponse.BodyHandlers.ofString());

                String respondStr = response.body();
                if(respondStr.startsWith("{\"data\"")) {
                    String repoDataStr = respondStr.substring(22, respondStr.length()-2);
                    RepoData repoData = mapper.readValue(repoDataStr, RepoData.class);
                    repoDataList.add(repoData);
                } else {
                    System.out.printf("Error:\n%s\n\n", respondStr);
                    repoDataList.add(null);
                }
            } else {
                repoDataList.add(null);
            }
        }
        System.out.println();
        return repoDataList;
    }

    private static String basicAuth(String username, String password) {
        return "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
    }

    private static void prepareOutputData(XSSFSheet sheet, List<RepoData> repoDataList) {
        final String totalCountKey = "totalCount";
        final String notApplicable = "n/a";

        for(int i = 0; i<repoDataList.size(); i++) {
            RepoData repoData = repoDataList.get(i);
            if(repoData == null) continue;

            // the 1st software starts from col 3 (cellnum = 2)
            int cellnum = i + 2;

            // last update
            Date updatedAt = repoData.getUpdatedAt();
            setCellValue(sheet, 3, cellnum, updatedAt);

            // percentage of closed issues
            int numOpenIssues = repoData.getOpenIssues().get(totalCountKey);
            int numTotalIssues = repoData.getTotalIssues().get(totalCountKey);
            if(numTotalIssues == 0) {
                setCellValue(sheet, 5, cellnum, notApplicable);
            }
            else {
                double percentageClosedIssues = (double) (numTotalIssues - numOpenIssues) / numTotalIssues;
                setCellValue(sheet, 5, cellnum, percentageClosedIssues);
            }

            // number of stars
            setCellValue(sheet, 7, cellnum, repoData.getStargazers().get(totalCountKey));
            // number of forks
            setCellValue(sheet, 8, cellnum, repoData.getForks().get(totalCountKey));
            // number of watchers
            setCellValue(sheet, 9, cellnum, repoData.getWatchers().get(totalCountKey));

            // number of open PR
            int numOpenPR = repoData.getOpenPullRequests().get(totalCountKey);
            setCellValue(sheet, 10, cellnum, numOpenPR);
            // number of closed PR
            int numClosedPR = repoData.getTotalPullRequests().get(totalCountKey) - numOpenPR;
            setCellValue(sheet, 11, cellnum, numClosedPR);

            // number of months
            Date createdAt = repoData.getCreatedAt();
            long numMonths = Period.between(
                createdAt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                LocalDate.now()
            ).toTotalMonths();
            setCellValue(sheet, 12, cellnum, numMonths);
            // current date
            setCellValue(sheet, 13, cellnum, new Date());
        }
    }

    private static void setCellValue(XSSFSheet sheet, int rownum, int cellnum, Object value) {
        Row row = sheet.getRow(rownum);
        if(row == null) row = sheet.createRow(rownum);
        Cell cell = row.getCell(cellnum);
        if(cell == null) cell = row.createCell(cellnum);
        if(value instanceof Integer) cell.setCellValue((int)value);
        if(value instanceof Long) cell.setCellValue((long)value);
        if(value instanceof Double) cell.setCellValue((double)value);
        if(value instanceof String) cell.setCellValue((String)value);
        if(value instanceof Date) cell.setCellValue((Date)value);
    }

}
