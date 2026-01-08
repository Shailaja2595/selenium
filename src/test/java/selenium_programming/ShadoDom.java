package selenium_programming;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShadoDom 
{
	
	static WebDriver driver;
	
	@BeforeMethod
	public void seup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
		
	@Test
	public void BookApp()
	{
		
     driver.get("https://books-pwakit.appspot.com/");
     
    SearchContext host = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
    host.findElement(By.id("input")).sendKeys("shailaja");
     
	}
	
	@Test(enabled=false)
	public  void ShadowElement() 
	{	
		driver.get("https://dev.automationtesting.in/shadow-dom");	
		SearchContext shadowroot = driver.findElement(By.cssSelector("div#shadow-root")).getShadowRoot();	
	    System.out.println(shadowroot.findElement(By.cssSelector("span#shadow-element")).getText());	 
	}

	@Test(enabled=false)
	public  void NestedShadowElement() {
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		SearchContext shadowroot = driver.findElement(By.cssSelector("div#shadow-root")).getShadowRoot();
		SearchContext NestedShadowElement = shadowroot.findElement(By.cssSelector("inner-shadow-dom#inner-shadow-dom")).getShadowRoot();
	    System.out.println(NestedShadowElement.findElement(By.cssSelector("span#nested-shadow-element")).getText());	
	}
	
	@Test(enabled=false)
	public  void MultinestedShadowElement() {

		driver.get("https://dev.automationtesting.in/shadow-dom");
		SearchContext shadowroot = driver.findElement(By.cssSelector("div#shadow-root")).getShadowRoot();
		SearchContext NestedShadowElement = shadowroot.findElement(By.cssSelector("inner-shadow-dom#inner-shadow-dom")).getShadowRoot();
		SearchContext multinestedshadowroot = NestedShadowElement.findElement(By.cssSelector("nested-shadow-dom#nested-shadow-dom")).getShadowRoot();
		System.out.println(multinestedshadowroot.findElement(By.cssSelector("span#multi-nested-shadow-element")).getText());
	}
}
