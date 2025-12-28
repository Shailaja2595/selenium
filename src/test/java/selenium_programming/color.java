package selenium_programming;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
public class color 
{
		public static void main(String[] args)
		{
	       WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			
			WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
			
			String v1 = login.getCssValue("background-color");
			
			System.out.println("background-color="+v1);
			
			
			
			String v12 = Color.fromString(v1).asHex();
			
			System.out.println(v12);

		}

	


}
