 package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> li = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		
		
		for(WebElement w:li) {
			
			String actual = w.getText();
			System.out.println(actual);
			
			if(actual.equalsIgnoreCase("selenium maven dependency")) {
			
				Thread.sleep(3000);
				
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", w);
				break;
				
			}
		}
		
		
		
	}

}
