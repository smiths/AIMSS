## Guidelines for using DataProcess.jar
``DataProcess.jar`` automatically does pairwise comparisons for AHP using Software Grading scores.

### Document Update Author

Ao Dong Feb 22, 2021

Peter Michalski, Aug 3, 2020

### Original Document Author

Adam Lazzarato & Sun Yue, May 28, 2014

### Usage
1. Make sure you have openjdk version ``11.X.X`` installed by using the command:
    ```
    java -version
    ```
    On a Mac it is better to update the JDK rather than just the JRE, so that the proper version of Java can be seen at the command line.

    On Ubuntu download latest version:
    ```
    sudo apt install default-jre
    ```

1. Copy your software measurement sheet (the tab) to ``AHP_Template.xlsx``.

1. **IMPORTANT**: compare your sheet with existing sheet ``Measurements``. If the positions of some rows and columns are different, you might need to update the source code. Please refer to Section ``Update source code according to needs``.

1. Delete the ``Measurements`` sheet, and rename your sheet as ``Measurements``.

1. Save and close ``AHP_Template.xlsx``

1. In command line, run
    ```
    java -jar DataProcess.jar
    ```
    
1. Open ``AHP_Template.xlsx``

1. If the ``AHP_Template.xlsx`` spreadsheet is not correctly recalculated, the recalculation needs to be forced. This can be done in Excel by the following steps (save before attempting):
    1. Press ``CTRL+H``
    1. Find What: ``=``
    1. Replace with: ``=``

1. In sheet ``AHP Data``, the software names should have been automatically filled. You might need to manually update the quality names. You can use quality names in sheet ``Scores`` as a reference.

1. Finally, there're 29 software packages in the example ``AHP_Template.xlsx`` spreadsheet, and if you have diffrent number of packages, you'll need to manually do some minor adjusts in sheet ``AHP Data``. This shouldn't be hard.

### Update source code according to needs
1. Import ``DataProcess`` project into a Java IDE (e.g. Intellij IDEA)

1. Make changes to source file Main.java according to your needs.

1. You might need to change some constants of the program, e.g.

    ``SHOULD_APPLY_SENSITIVITY_ANALYSIS`` determines whether or not to use the orignial assigned scores,

    set ``ROW_SOFTWARE`` to the row number of software names in sheet ``Measurements``
    
    set ``ROWS_QUALITY`` to the rows of quality names in sheet ``Measurements``

1. All dependency libraries are in the folder ``lib``. You might need to manually add them if the IDE hasn't.

1. It's a good idea to copy ``AHP_Template.xlsx`` to the ``DataProcess`` project folder, so you can run the program with IDE for testing.

1. Build the artifact/jar as ``DataProcess.jar``, and use this one instead of the existing one.

### Contact
For help please contact donga9@mcmaster.ca

