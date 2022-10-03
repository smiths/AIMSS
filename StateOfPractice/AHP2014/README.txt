DataProcess.jar - Automatically do pairwise comparisons for AHP using Software Grading scores.

Author: Adam Lazzarato & Sun Yue
Date: May 28, 2014

Usage:
1. Make sure you have Java Runtime Environment 1.7 installed by using the command:

    java -version

(On a Mac it is better to update the JDK rather than just the JRE, so that the proper version of Java can be seen at the command line.)

2. Open AHP_Template.xlsx and copy your scores for each software to the second worksheet (the tab is labeled Sheet1).

3. Save and close AHP_Template.xlsx

4. Run DataProcess-v2.jar. (java -jar DataProcess-v2.jar) A dialog box will appear when the calculations are complete.

5. Open AHP_Template.xlsx

6. If the AHP_Template.xlsx spreadsheet is not correctly recalculated, the recalculation needs to be forced.  This can be done in Excel by the following steps (save before attempting):
6.1 Press CTRL+H
6.2 Find What: =
6.3 Replace with: =

Making changes & Building new JAR file:
1. Import project into Eclipse
2. Make changes to source
3. Make sure the external JAR files in the directory are correctly added to the Build Path.
4. Run the file to generate a configuration "Main - DataProcess"
5. File --> Export --> Java --> Runnable JAR file
6. Be sure to use the "Main - DataProcess" configuration and select "Copy required libraries into a sub-folder next to the generated JAR"
