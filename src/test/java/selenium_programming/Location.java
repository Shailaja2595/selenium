package selenium_programming;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location 
{

	public static void main(String[] args) 
	{

		 WebDriver driver=new ChromeDriver();	
		 driver.get("https://www.google.com/");
		 
		 Point searchBox = driver.findElement(By.name("q")).getLocation();
		 System.out.println("the x coordinate of search box : "+searchBox.x);
		 System.out.println("the x coordinate of search box : "+searchBox.y);

	}

}
