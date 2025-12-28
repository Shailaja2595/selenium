package demo;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon

{
	    public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        // 1. Open Amazon
	        driver.get("https://www.amazon.in");

	        // 2. Search for mobiles
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles", Keys.ENTER);

	        // 3. Scroll twice
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(2000);
	        js.executeScript("window.scrollBy(0,1000)");

	        // 4. Locate 7th mobile
	        WebElement seventhMobile = driver.findElement(
	            By.xpath("(//div[@id='sac-suggestion-row-7']"));

	        System.out.println("7th Mobile: " + seventhMobile.getText());

	        // 5. Open in new tab
	        String openInNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
	        seventhMobile.sendKeys(openInNewTab);

	        // cleanup
	        driver.quit();
	    }

}
