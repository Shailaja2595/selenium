package selenium_programming;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadoDom {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		//ShadowElement();
	//	NestedShadowElement();
		MultinestedShadowElement();
	}
	
	public static void ShadowElement() {
		
		driver=new ChromeDriver();
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		SearchContext shadowroot = driver.findElement(By.cssSelector("div#shadow-root")).getShadowRoot();
		
	System.out.println(shadowroot.findElement(By.cssSelector("span#shadow-element")).getText());	
	 
	}

	public static void NestedShadowElement() {
		driver = new ChromeDriver();

		driver.get("https://dev.automationtesting.in/shadow-dom");
		SearchContext shadowroot = driver.findElement(By.cssSelector("div#shadow-root")).getShadowRoot();
		SearchContext NestedShadowElement = shadowroot.findElement(By.cssSelector("inner-shadow-dom#inner-shadow-dom")).getShadowRoot();
	System.out.println(NestedShadowElement.findElement(By.cssSelector("span#nested-shadow-element")).getText());	
	}
	
	public static void MultinestedShadowElement() {
		driver = new ChromeDriver();

		driver.get("https://dev.automationtesting.in/shadow-dom");
		SearchContext shadowroot = driver.findElement(By.cssSelector("div#shadow-root")).getShadowRoot();
		SearchContext NestedShadowElement = shadowroot.findElement(By.cssSelector("inner-shadow-dom#inner-shadow-dom")).getShadowRoot();
		SearchContext multinestedshadowroot = NestedShadowElement.findElement(By.cssSelector("nested-shadow-dom#nested-shadow-dom")).getShadowRoot();
		System.out.println(multinestedshadowroot.findElement(By.cssSelector("span#multi-nested-shadow-element")).getText());
	}
}
