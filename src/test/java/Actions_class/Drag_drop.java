package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop 
{
	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://jqueryui.com/droppable/");
	    int v = driver.findElements(By.tagName("iframe")).size();
	    
	    System.out.println("frams=" + v);
	    
	    driver.switchTo().frame(0);
	    
	  WebElement drag = driver.findElement(By.id("draggable")); 
	WebElement drop = driver.findElement(By.id("droppable"));
	  Thread.sleep(3000);
	 
	  Actions act=new Actions(driver);
	  
	  act.clickAndHold(drag).moveToElement(drop).build().perform();
	 
		}

}
