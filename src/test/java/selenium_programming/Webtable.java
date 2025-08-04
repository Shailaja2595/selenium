package selenium_programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable 
{
    public static void main(String[] args) throws InterruptedException 
    {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	int row = driver.findElements(By.xpath("//table[@id='customers']//td")).size();
	int clm = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	
	for(int i=1;i<row;i++)
	{
		for(int j=1;j<=clm;j++)
		{
			
			 String actual = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
			 if(actual.equals("Laughing Bacchus Winecellars"))
			 {
				 System.out.println(" i = "+i+"j = "+j);
				 
			 }
		}
	}
	}
}
