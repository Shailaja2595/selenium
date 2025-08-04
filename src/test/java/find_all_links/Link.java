package find_all_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		
	List<WebElement> link = driver.findElements(By.tagName("a"));
	int size = link.size();
	System.out.println(size);
	
//	for(int i=0;i<size;i++)
//	{
//	WebElement s = link.get(i);
//	String text = s.getText();
//		
//		System.out.println(text);
//	}
	
	for(WebElement e:link) 
	{
		System.out.println(e.getText());
	}
		
		Thread.sleep(3000);
	//	driver.quit();

	}

}
