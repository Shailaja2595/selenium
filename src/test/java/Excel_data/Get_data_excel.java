package Excel_data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class Get_data_excel 
{

	@DataProvider
	public Object[][] excel() throws IOException
	{
	FileInputStream fs= new FileInputStream("./src/test/java/Book1.xlsx");
	XSSFWorkbook wk=new XSSFWorkbook(fs);
	XSSFSheet sheet = wk.getSheet("Sheet1");
	int row = sheet.getPhysicalNumberOfRows();
	int clm = sheet.getRow(0).getLastCellNum();
	
	Object[][] obj=new Object[row-1][clm];
	
	for(int i=0;i<row-1;i++)
	{
		for(int j=0;j<clm;j++)
		{
			DataFormatter df=new DataFormatter();
		obj[i][j]=	df.formatCellValue(sheet.getRow(i+1).getCell(j));
		}
	}
	return obj;
	}
}
