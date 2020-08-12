import java.io.File; 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
	
	public static void main(String[] args)
    {
		int minRandNumber = -1;
		int maxRandNumber = 1;
		int numberQualities = 9;
		int numberSoftwarePackages = 23; 
		Cell[][] table=new Cell[numberQualities][numberSoftwarePackages];
        try
        {
            FileInputStream file = new FileInputStream(new File("AHP_Template.xlsx"));
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get sheet from the workbook
            XSSFSheet sheet = workbook.getSheet("AssignedScores");
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();            
            int r=0;
            int col=0;
            while (rowIterator.hasNext())
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType())
                    {
                        case Cell.CELL_TYPE_NUMERIC:
                        	table[r][col]=cell;
                        	col++;
                            break;
                        case Cell.CELL_TYPE_STRING:
                            break;
                        default:
                           	break;
                    }                    
                }
                r++;
                col=0;
            }
            XSSFSheet sheetnew;
            if(workbook.getSheet("SensitivityScores")==null){
            	sheetnew= workbook.createSheet("SensitivityScores");
            }
            else{
            	sheetnew=workbook.getSheet("SensitivityScores");
            }

     		int cellnum=1;
     		Row[] row=new Row[numberQualities];     		 		
     		
            for (int i=0;i<numberQualities;i++)
            {                
         		row[i]=sheetnew.getRow(i);
                for (int j=0;j<numberSoftwarePackages;j++)
                {
                	Cell cell = row[i].createCell(cellnum);
                	float placeholder = (float) table[i][j].getNumericCellValue();
                	Random ran0 = new Random();
                	float random = (minRandNumber + ran0.nextFloat() * (maxRandNumber - minRandNumber));
                	float finalNumber = placeholder + random;
                	if(finalNumber<0) {
                		finalNumber=0;
                	}
                	if(finalNumber>10) {
                		finalNumber=10;
                	}
                    cell.setCellValue(finalNumber); 
                	cellnum++;
                }
                cellnum=1;
            }    
            try
            {
                //Write the workbook in file system
                FileOutputStream out = new FileOutputStream(new File("AHP_Template.xlsx"));
                workbook.write(out);
                out.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            file.close();
            JOptionPane.showMessageDialog(null, "Process Done!!:)");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }        
    }
}
