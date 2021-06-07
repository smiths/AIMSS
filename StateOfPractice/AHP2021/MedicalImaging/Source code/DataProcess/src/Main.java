import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * All the constants in capital cases should be manually set according to needs and the .xlsx file
 * e.g. SHOULD_APPLY_SENSITIVITY_ANALYSIS, STARTING_COL, SOFTWARE_ROW, etc.
 */
public class Main {
    private static double[][] scores;
    private static List<String> softwareNames;
    private static List<String> qualityNames;
    private static int numberSoftwarePackages;
    private static int numberQualities;
    private static int rowScoresSheet;

    public static void main(String[] args) {
        // To use the original assigned scores, change this variable to false;
        boolean SHOULD_APPLY_SENSITIVITY_ANALYSIS = false;

        try {
            FileInputStream file = new FileInputStream(new File("AHP_Template.xlsx"));
            // Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            file.close();

            // Read data from sheet "Measurements" and write original assigned scores into sheet "Scores"
            System.out.println("Reading data from sheet 'Measurements'...\n");
            readData(workbook);

            // Calculate the sensitivity scores and write into sheet "Scores"
            if (SHOULD_APPLY_SENSITIVITY_ANALYSIS) {
                System.out.println("Applying sensitivity analysis...\n");
                applySensitivityAnalysis(workbook);
            }

            // Process AHP data
            System.out.println("Calculating AHP scores...\n");
            calculateAHPScores(workbook);

            // Write the workbook in file system
            System.out.println("Writing to the .xlsx file...\n");
            FileOutputStream out = new FileOutputStream(new File("AHP_Template.xlsx"));
            workbook.write(out);
            out.close();

            System.out.println("Process Done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readData(XSSFWorkbook workbook) {
        /*
         * The following constants are based on the positions of the cells in the .xlsx file
         */
        // Based on the "Measurements" sheet
        int ROW_SOFTWARE = 3; // the row of software names
        int COL_1ST_SOFTWARE = 3; // the col of the 1st software
        int[] ROWS_QUALITY = new int[]{22, 39, 50, 58, 63, 70, 80, 85, 96}; // the rows of the quality names
        int COL_QUALITY = 1; // the col of quality names
        int[] ROWS_SCORE = new int[]{37, 48, 56, 61, 68, 78, 83, 94, 101}; // the rows of the overall scores
        // Based on the "AHP Data" sheet
        int MAX_NUM_SOFTWARE_AHP = 30; // the max number of software
        int ROW_1ST_SOFTWARE_AHP = 2; // the row of the 1st software
        int COL_SOFTWARE_AHP = 2; // the col of software names

        // Get sheet from the workbook
        XSSFSheet sheet = workbook.getSheet("Measurements");

        // Read software names
        softwareNames = new ArrayList<>();
        Iterator<Cell> cellIterator = sheet.getRow(ROW_SOFTWARE - 1).cellIterator();
        for (int i = 0; i < COL_1ST_SOFTWARE - 1; i++) cellIterator.next();
        while (cellIterator.hasNext()) {
            softwareNames.add(cellIterator.next().getStringCellValue());
        }
        System.out.println("Software Names = " + softwareNames);

        // Read quality names
        qualityNames = new ArrayList<>();
        for (int row : ROWS_QUALITY) {
            qualityNames.add(sheet.getRow(row - 1).getCell(COL_QUALITY - 1).getStringCellValue());
        }
        System.out.println("Quality Names = " + qualityNames);

        numberSoftwarePackages = softwareNames.size();
        numberQualities = qualityNames.size();

        // Read scores
        scores = new double[numberQualities][numberSoftwarePackages];
        for (int i = 0; i < numberQualities; i++) {
            for (int j = 0; j < numberSoftwarePackages; j++) {
                int row = ROWS_SCORE[i];
                int col = j + COL_1ST_SOFTWARE;
                Cell cell = sheet.getRow(row - 1).getCell(col - 1);
                if (cell != null && cell.getCellType() == CellType.NUMERIC) {
                    scores[i][j] = cell.getNumericCellValue();
                }
            }
        }
        System.out.println("Assigned scores = ");
        printMatrix(scores);

        // Write software names to "AHP Data" sheet
        sheet = workbook.getSheet("AHP Data");
        for (int i = 0; i < MAX_NUM_SOFTWARE_AHP; i++) {
            int row = i + ROW_1ST_SOFTWARE_AHP - 1;
            int col = COL_SOFTWARE_AHP - 1;
            Row sheetRow = sheet.getRow(row);
            if (sheetRow == null) sheetRow = sheet.createRow(row);
            Cell cell = sheetRow.getCell(col);
            if (cell == null) cell = sheetRow.createCell(col);
            if (i < numberSoftwarePackages) {
                cell.setCellValue(softwareNames.get(i));
            } else {
                cell.setCellValue("");
            }
        }

        // Write assigned scores to "Scores" sheet
        sheet = workbook.getSheet("Scores");
        if (sheet != null) {
            workbook.removeSheetAt(workbook.getSheetIndex(sheet));
        }
        sheet = workbook.createSheet("Scores");
        workbook.setSheetOrder("Scores", 1);
        sheet.setColumnWidth(0, 10000);

        rowScoresSheet = 0;
        sheet.createRow(rowScoresSheet).createCell(0).setCellValue("Note: most data are extracted from the 'Measurements' sheet, and the Sensitivity Scores are calculated.");
        writeScores(sheet, "Assigned Scores");
    }

    private static void applySensitivityAnalysis(XSSFWorkbook workbook) {
        // Set the lower and upper bound of the random numbers according to needs
        double LOWER_BOUND = -1;
        double UPPER_BOUND = 1;

        // Adjust scores with random numbers
        for (int i = 0; i < numberQualities; i++) {
            for (int j = 0; j < numberSoftwarePackages; j++) {
                Random ran0 = new Random();
                double random = LOWER_BOUND + ran0.nextDouble() * (UPPER_BOUND - LOWER_BOUND);
                scores[i][j] += random;
                scores[i][j] = Math.max(scores[i][j], 0);
                scores[i][j] = Math.min(scores[i][j], 10);
            }
        }
        System.out.println("sensitivity scores = ");
        printMatrix(scores);

        // Write sensitivity scores to "Scores" sheet
        XSSFSheet sheet = workbook.getSheet("Scores");
        writeScores(sheet, "Sensitivity Scores");
    }

    private static void writeScores(XSSFSheet sheet, String str) {
        rowScoresSheet += 3;
        sheet.createRow(rowScoresSheet).createCell(0).setCellValue(str);
        rowScoresSheet++;
        Row sheetRow = sheet.createRow(rowScoresSheet);
        for (int i = 0; i < numberSoftwarePackages; i++) {
            sheetRow.createCell(i + 1).setCellValue(softwareNames.get(i));
        }
        rowScoresSheet++;
        for (int i = 0; i < numberQualities; i++) {
            sheetRow = sheet.createRow(rowScoresSheet);
            sheetRow.createCell(0).setCellValue(qualityNames.get(i));
            for (int j = 0; j < numberSoftwarePackages; j++) {
                sheetRow.createCell(j + 1).setCellValue(scores[i][j]);
            }
            rowScoresSheet++;
        }
    }

    private static void calculateAHPScores(XSSFWorkbook workbook) {
        /*
         * The following constants are based on the positions of the cells in the .xlsx file
         */
        // Based on the "AHP Data" sheet
        int[] ROWS_QUALITY = {98, 132, 166, 200, 234, 268, 302, 336, 370}; // rows of qualities
        int COL_1ST_AHP_SCORE = 3; // the 1st column of AHP scores

        // Calculate AHP scores
        double[][][] ahpScores = new double[numberQualities][numberSoftwarePackages][numberSoftwarePackages];
        for (int i = 0; i < numberQualities; i++) {
            for (int j = 0; j < numberSoftwarePackages; j++) {
                for (int k = 0; k < numberSoftwarePackages; k++) {
                    // upper triangle = 1 / lower triangle
                    double score1 = scores[i][j];
                    double score2 = scores[i][k];
                    double ahpScore = Math.min(Math.abs(score1 - score2) + 1, 9); // 1 <= ahpScore <= 9
                    if (score1 >= score2) {
                        ahpScores[i][j][k] = ahpScore;
                    } else {
                        ahpScores[i][j][k] = 1 / ahpScore;;
                    }
                }
            }
        }

        // Write AHP scores to "AHP Data" sheet
        XSSFSheet sheet = workbook.getSheet("AHP Data");

        for (int i = 0; i < numberQualities; i++) {
            int startingRow = ROWS_QUALITY[i] + 1;
            for (int j = 0; j < numberSoftwarePackages; j++) {
                Row sheetRow = sheet.getRow(j + startingRow - 1);
                for (int k = 0; k < numberSoftwarePackages; k++) {
                    Cell cell = sheetRow.getCell(k + COL_1ST_AHP_SCORE - 1);
                    if(cell == null) cell = sheetRow.createCell(k + COL_1ST_AHP_SCORE - 1);
                    cell.setCellValue(ahpScores[i][j][k]);
                }
            }
        }
    }

    private static void printMatrix(double[][] m) {
        DecimalFormat df2 = new DecimalFormat("#.##");
        int n = m.length;
        for(int i=0; i<Math.min(3, n); i++) {
            double[] row = m[i];
            System.out.print("[");
            for(double d : row) {
                System.out.print(df2.format(d));
                System.out.print(" ");
            }
            System.out.println("]");
        }
        if(n>3) System.out.println(String.format("... and %d more rows ...\n", n - 3));
    }
}
