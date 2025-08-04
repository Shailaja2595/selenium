package keyboard_keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class ArrowKeyInput 
{
	    public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/");  // Replace with actual URL

	        // Locate the input box
	        WebElement inputBox = driver.findElement(By.id("APjFqb")); // Update selector

	        // Send some text (optional)
	        inputBox.sendKeys("Selenium");

	        Thread.sleep(2000);
	        
	        // Send DOWN arrow key
	        inputBox.sendKeys(Keys.ARROW_DOWN);

	        Thread.sleep(2000);
	        
	        // Send UP arrow key
	        inputBox.sendKeys(Keys.ARROW_UP);

	        Thread.sleep(2000);
	        
	        // Press ENTER (optional)
	        inputBox.sendKeys(Keys.ENTER);
	    }
	

	
	
	
}
