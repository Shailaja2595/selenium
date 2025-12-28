package Authentication_POPUP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POP_UP
{

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		
		//Basic URL
		 // driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


	}

}
