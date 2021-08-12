#Tutorial for GitHub Metrics Collector
####Author: Ao Dong https://github.com/Ao99

This Java script automatically collects GitHub metrics from a set of GitHub repos.

## 1. The Spreadsheet
The script uses a spreadsheet for inputs and outputs. Make sure the existence of it, and double-check the file name and sheet name.
In the code, the default names are set as follows
~~~Java
private final static String fileName = "GitHub_Metrics_Template.xlsx";
private final static String sheetName = "Sheet1";
~~~

## 2. Inputs
The only mandatory input is a set of repo urls. Make sure it starts from Column C and spreads in Row 2. If you decide to put it somewhere else, change the values in function ***readInputData*** accordingly.

Adding the names of software to Row 1 is optional.

## 3. GitHub Authentication
The script uses GitHub GraphQL API to retrieve data. See details in https://docs.github.com/en/graphql

Thus, the script needs your GitHub username and token for the auth. In the code, change the following lines to your credentials:
~~~Java
private final static String gitHubUsername = "your_GitHub_username";
private final static String gitHubToken = "your_GitHub_token";
~~~

Do NOT commit your credentials to this git repo. If you accidentally did, just disable this token in your GitHub account settings.

Tutorials of creating a GitHub token for GraphQL API are at https://docs.github.com/en/graphql/guides/forming-calls-with-graphql#authenticating-with-graphql

## 5. Maven
This is a Maven Java project. Dependencies are managed in the file ***pom.xml***. Tutorials for Maven are at https://maven.apache.org/ 

## 6. Running the Script
Use a compiler to load the dependencies and run the code. IntelliJ IDEA is recommended.

If you are interested, here are some ideas to improve this project:
- build this Maven project to jar file
- take GitHub credentials from command line inputs