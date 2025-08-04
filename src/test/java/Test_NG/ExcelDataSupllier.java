package Test_NG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupllier
{
     @DataProvider(name="loginTest")
     
	public String[][]  getData() throws IOException 
	{
     File f=new File("./src/test/resources/ExcelData1.xlsx");
     System.out.println(f.exists());
    	  
     FileInputStream fs = new FileInputStream(f);
     XSSFWorkbook workbook= new XSSFWorkbook(fs);
     XSSFSheet sheet= workbook.getSheet("Sheet1");
     
    // System.out.println( sheet.getPhysicalNumberOfRows());
     
     int noOfRows= sheet.getPhysicalNumberOfRows();
     int noOfColumns=sheet.getRow(0).getLastCellNum();
     
   //  System.out.println( sheet.getLastRowNum());
     
     String[][] data=new String[noOfRows][noOfColumns];
     
     for(int i=0;i<noOfRows-1;i++)
     {
    	 for (int j = 0; j < noOfColumns; j++) 
    	 {
    		 DataFormatter df=new DataFormatter();
    		 data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
    		  
    //	 System.out.println( sheet.getRow(i).getCell(j).getStringCellValue());
    		 
		 }
    	 System.out.println();
     }
     
     workbook.close();
     fs.close();
     
//     for (String[] dataArr : data)
//     {
//    	 System.out.println( Arrays.toString(dataArr));
//	 }
       return data;
     
	}

}
