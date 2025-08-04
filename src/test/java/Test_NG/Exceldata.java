package Test_NG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.Format;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Exceldata {
	@DataProvider()
	public Object[][] testdata() throws IOException {
		
		FileInputStream fs=new FileInputStream("./test-output/old/Book1.xlsx");
		XSSFWorkbook wk=new XSSFWorkbook(fs);
		
		XSSFSheet v = wk.getSheet("Sheet1");
		
		int rows = v.getPhysicalNumberOfRows();
		int clm = v.getRow(0).getLastCellNum();
		
		Object[][] ob=new Object[rows-1][clm];
		
		
		for(int i=0; i<rows-1; i++) {
			for(int j=0; j<clm; j++) {
				
				DataFormatter d=new DataFormatter();
				ob[i][j]=d.formatCellValue(v.getRow(i+1).getCell(j));
				
			}
		}
		return ob;
	}

}
