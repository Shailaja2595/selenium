package Automation;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Logo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
     WebElement logo = driver.findElement(By.className("myntraweb-sprite"));
		String v = driver.findElement(By.className("myntraweb-sprite")).getDomAttribute("class");
		System.out.println(v);
		
	//	 Get height and width
		int height = logo.getSize().getHeight();
		int width = logo.getSize().getWidth();
		System.out.println("Height: " + height + " | Width: " + width);

		// Validate height and width
		Assert.assertEquals(height, 36, "Logo height mismatch");
		Assert.assertEquals(width, 53, "Logo width mismatch");

		// Get color (for SVG or styled logos)
		String color = logo.getCssValue("color");  // For font/icon logos
		System.out.println("Logo color: " + color);

		// For background color or image logo
		String bgColor = logo.getCssValue("background-color");
		System.out.println("Logo background color: " + bgColor);
		
	
	}

}
