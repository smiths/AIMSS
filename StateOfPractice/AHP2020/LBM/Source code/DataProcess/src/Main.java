import java.io.File; 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
	
	public static void main(String[] args)
    {
		int numberQualities = 9;
		int numberSoftwarePackages = 23; //also need to change rownum below
		Cell[][] table=new Cell[numberQualities][numberSoftwarePackages];
		Double[][][] ahpTable= new Double[numberQualities][numberSoftwarePackages][numberSoftwarePackages-1];
        try
        {
            FileInputStream file = new FileInputStream(new File("AHP_Template.xlsx"));
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get second sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(1);
 
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
            if(workbook.getSheet("AHP Example")==null){
            	sheetnew= workbook.createSheet("AHPDATA");
            }
            else{
            	sheetnew=workbook.getSheet("AHP Example");
            }
            double x=0;
            double y=0;
            for(int i=0;i<numberSoftwarePackages;i++)
            {
            	for(int j=i;j<numberSoftwarePackages-1;j++)
            	{   
            		for(int k=0;k<numberQualities;k++)
            		{
            			if(table[k][i].getNumericCellValue()==10 && table[k][j+1].getNumericCellValue()==1)
            			{
            			//	table[k][i].setCellValue(9);
            				x=9;
            				y=table[k][j+1].getNumericCellValue();
            			}else if(table[k][j+1].getNumericCellValue()==10 && table[k][i].getNumericCellValue()==1){
            			//	table[k][j+1].setCellValue(9);
            				y=9;
            				x=table[k][i].getNumericCellValue();
            			}else{
            				x=table[k][i].getNumericCellValue();
            				y=table[k][j+1].getNumericCellValue();
            			}
            			
            			if(table[k][i].getNumericCellValue()>=table[k][j+1].getNumericCellValue())
                		{
                		//	ahpTable[k][i][j]=table[k][i].getNumericCellValue()-table[k][j+1].getNumericCellValue()+1;
            				ahpTable[k][i][j]=x-y+1;
                		}
                		else{
                		//	ahpTable[k][i][j]=1/(table[k][j+1].getNumericCellValue()-table[k][i].getNumericCellValue()+1);
                			ahpTable[k][i][j]=1/(y-x+1);
                		}            			
            		}
            	}
            }
         
            //for each additional quality, another rownum needs to be added that represents the starting cell of the new quality in the xlxs template.
            int rownum[] = {98,132,166,200,234,268,302,336,370};
     		int cellnum=3;
     		int cellstart=cellnum;
     		Row[] row=new Row[numberQualities];     		 		
     		
            for (int i=0;i<numberSoftwarePackages;i++)
            {                
                cellnum=cellstart++;
                for(int k=0;k<numberQualities;k++){
         			row[k]=sheetnew.getRow(rownum[k]);
         			rownum[k]++;
         		}
                
                for (int j=i;j<numberSoftwarePackages-1;j++)
                {
                	for(int l=0;l<numberQualities;l++)
                	{
                		Cell cell = row[l].createCell(cellnum);
                        cell.setCellValue(ahpTable[l][i][j]);
                	}     
                	cellnum++;
                }                
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
