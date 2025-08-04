package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_myntra 
{
	public static  WebDriver driver;
	
	@DataProvider(name="data")
	public Object[] [] testcase1()
	{
		Object[][] data = new Object[10][1];
		
		data[0][0]="shoe";
		data[1][0]="laptop";
		data[2][0]="tv";
		data[3][0]="dress";
		data[4][0]="cover";
		data[5][0]="mobile";
		data[6][0]="pillow";
		data[7][0]="pen";
		data[8][0]="shirt";
		data[9][0]="top";
		
		return data ;
	}
	
	@Test(dataProvider="data")
	public void testcase2(String search) throws InterruptedException
	{
		   driver=new ChromeDriver();
		   
		   
		   driver.manage().window().maximize();
		   driver.get("https://www.amazon.in/");
		   
		WebElement  search1 = driver.findElement(By.id("twotabsearchtextbox"));
		search1.sendKeys(search);
	
		
		
		
		
	}
}
