package keyboard_keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboard {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	WebElement a = driver.findElement(By.id("email"));
	a.sendKeys("shailajaa");
	a.sendKeys(Keys.BACK_SPACE);
	
	a.sendKeys(Keys.CONTROL+"a");
	a.sendKeys(Keys.CONTROL+"c");
	
	WebElement b = driver.findElement(By.id("pass"));
	b.sendKeys(Keys.CONTROL+"v");
		
	}

}
