package io.ao9.GitHubMetricsCollector;

import lombok.*;

import java.util.Date;
import java.util.Map;

/*
 * lombok simply saves time to write
 * getter, setter, constructor and toString
 */
@NoArgsConstructor
@Data
@ToString
public class RepoData {
    private Map<String, Integer> stargazers;
    private Map<String, Integer> forks;
    private Map<String, Integer> watchers;
    private Map<String, Integer> openIssues;
    private Map<String, Integer> totalIssues;
    private Map<String, Integer> openPullRequests;
    private Map<String, Integer> totalPullRequests;
    private Date createdAt;
    private Date updatedAt;
}
