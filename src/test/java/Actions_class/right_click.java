package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act=new Actions(driver);
	WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.contextClick(right_click).build().perform();
		
	 WebElement paste = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste']"));
      String h = paste.getText();
      System.out.println(h);

      paste.click();
      
      driver.switchTo().alert().accept();
	}

}
