package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class select_location_dropdown
{

	public static void main(String[] args) throws InterruptedException 
	{

	    WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		//Departure City dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//Departure City
		driver.findElement(By.xpath("//a[@value='VGA']")).click();
		
		Thread.sleep(3000);
		
		//Arrival City
	//	driver.findElement(By.xpath("(//a[@value='CJB'])[2]")).click();
		
		//without giving index Arrival City xpath
		//Parent child relationship xpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
	}

}
