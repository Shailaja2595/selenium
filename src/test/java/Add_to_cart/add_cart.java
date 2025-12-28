package Add_to_cart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_cart 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
        driver.manage().window().maximize();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.findElement(By.id("userEmail")).sendKeys("shailaja2595@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Shailaja@123");
		driver.findElement(By.id("login")).click();
	
	    List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	WebElement prod = products.stream().filter(e->
	e.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
	
	prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	
	
	
	}

}
