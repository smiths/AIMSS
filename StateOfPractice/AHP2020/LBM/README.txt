AHP2020LBM.jar - Automatically do pairwise comparisons for AHP using Software Grading scores.

Document Update Author: Peter Michalski
Date: Aug 3, 2020

Original Document Author: Adam Lazzarato & Sun Yue
Date: May 28, 2014

Usage:
1. Make sure you have openjdk version "11.X.X" installed by using the command:

    java -version

(On a Mac it is better to update the JDK rather than just the JRE, so that the proper version of Java can be seen at the command line.)

On Ubuntu download latest version:

sudo apt install default-jre

2. Open AHP_Template.xlsx (found in AHP2020LBM folder) and copy your scores for each software to the third worksheet (the tab is labeled AssignedScores).

3. Save and close AHP_Template.xlsx

4. Run java -cp SensitivityAnalysis.jar Main (the file is currently set up for a sensitivity addition of -1 to 1, and for 9 qualities and 23 software solutions) 

4. Run AHP2020LBM.jar. (java -jar AHP2020LBM.jar) A dialog box will appear when the calculations are complete.

5. Open AHP_Template.xlsx

6. If the AHP_Template.xlsx spreadsheet is not correctly recalculated, the recalculation needs to be forced.  This can be done in Excel by the following steps (save before attempting):
6.1 Press CTRL+H
6.2 Find What: =
6.3 Replace with: =

Making changes & Building new AHP2020LBM JAR file:
1. Import DataProcess project into Eclipse
2. Make changes to source file Main.java (update number of numberSolvers, currently set at 23, and numberQualities, curently set at 9, as well as add or remove another rownum[] value for each quality - this represents the beginning xlxs cell for each quality). 
3. Make sure the external JAR files in the directory are correctly added to the Build Path.
4. Run the file to generate a configuration "Main - DataProcess"
5. File --> Export --> Java --> Runnable JAR file
6. Be sure to use the "Main - DataProcess" configuration and select "Copy required libraries into a sub-folder next to the generated JAR"
7. Place the jar into  AHP2020/LBM

Also update the excel template (AHP_Template.xlxs) by adding additional qualities and solvers at the top of the document and in each of the tables. You will need to update both the template under AHP2020LBM and under AHP2020LBM/Source code/DataProcess. The latter one is used to test the Main.java program prior to creating a jar file, which uses the former template once the jar is placed in the AHP2020LBM folder. 

Making changes & Building new SensitivityAnalysis JAR file:
Similar to above but import DataProcessSensitivityAnalysis project
Similar to above but need to ipdate the numberSolvers, numberQualities, and/or maxRandNumber and minRandNumber
Export using "SensitivityAnalysis - DataProcess"

For help please contact michap@mcmaster.ca

