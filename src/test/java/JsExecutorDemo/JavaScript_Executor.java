package JsExecutorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open URL
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// enter text in username
		js.executeScript("document.getElementById('email').value='shailaja';");

		// click on login
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));

		js.executeScript("arguments[0].click();", login);

		// Refresh browser
		// js.executeScript("history.go(0)");

		// get domain name
		String domain = js.executeAsyncScript("return document.domain;").toString();
		System.out.println("Domain : " + domain);

		// get Title name
		String title = js.executeAsyncScript("return document.title;").toString();
		System.out.println("Title : " + title);

		// get URL name
		String url = js.executeAsyncScript("return document.URL;").toString();
		System.out.println("URL : " + url);
		
		//draw border around web element
		js.executeScript("arguments[0].style.border='3px solid red';", login);
		
		//Zoom 50%
		js.executeScript("document.body.style.zoom='50%'");

		//Return Height and Width of web page
		System.out.println(js.executeScript("return window.innerHeight;").toString());
		System.out.println(js.executeScript("return window.innerWidth;").toString());
		
		//scroll vertically till the end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//scroll vertically Page UP 
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		//generate alert pop up
		js.executeScript("alert('This is my alert Message.');");
		
		//navigate to next url
		js.executeScript("window.location='https://www.google.com'");
		
		//fash web element
		String bgColor=login.getCssValue("backgroundcolor");
		for(int i=0;i<50;i++)
		{
			js.executeScript("arguments[0].style.backgroundColor='#000000'", login);  // black
			try
            {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			js.executeScript("arguments[0].style.backgroundColor='"+bgColor+"'", login);  // black
			
			try
            {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
		}
		
	}

}




















