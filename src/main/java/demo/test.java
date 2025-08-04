package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		List<WebElement> priceElements = driver.findElements(By.xpath("//div[contains(@class, 'priceSection')]//p[contains(@class, 'blackText')]"));

		for (WebElement price : priceElements) {
		    System.out.println("Flight Price: " + price.getText());
		}

	}

}
