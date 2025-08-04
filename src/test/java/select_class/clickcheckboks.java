package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickcheckboks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> lastrowvalue = driver.findElements(By.xpath("//div[@id='HTML1']//div//tbody/tr"));
		
		for (WebElement e : lastrowvalue) {
			
			List<WebElement> vv = e.findElements(By.tagName("td"));
			
			if(vv.size()>0) {
				String v = vv.get(3).getText();
				
				System.out.println(v);
			}
			
		}

	}

}
