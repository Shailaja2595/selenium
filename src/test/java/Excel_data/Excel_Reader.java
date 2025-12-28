package Excel_data;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;

public class Excel_Reader
{

	    public static void main(String[] args) throws IOException 
	    {
	        // Path of Excel file
	        FileInputStream fis = new FileInputStream("./src/test/java/Book1.xlsx");

	        // Load workbook
	        Workbook wb = WorkbookFactory.create(fis);

	        // Load sheet
	        Sheet sheet = wb.getSheet("Sheet1");
	        
           DataFormatter formatter = new DataFormatter();
	        
	        // Loop through rows
	        for (int i = 1; i <= sheet.getLastRowNum(); i++)
	        
	        {
	            Row row = sheet.getRow(i);
	            
	            // Get username and password as String
	            String username = formatter.formatCellValue(row.getCell(0));
	            String password = formatter.formatCellValue(row.getCell(1));
	            
	            System.out.println("Username: " + username + " | Password: " + password);
	        }

	        wb.close();
	        fis.close();
	    
	    
	}

	
	
}
