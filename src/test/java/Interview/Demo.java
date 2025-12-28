package Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) 
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		SearchContext f = driver.findElement(By.cssSelector("div#shadow-root")).getShadowRoot();
		
		SearchContext f1 = f.findElement(By.cssSelector("inner-shadow-dom#inner-shadow-dom")).getShadowRoot();
		
		SearchContext f2 = f1.findElement(By.cssSelector("nested-shadow-dom#nested-shadow-dom")).getShadowRoot();
		
		String final1 = f2.findElement(By.cssSelector("span#multi-nested-shadow-element")).getText();
		
		System.out.println(final1);
	}

}
