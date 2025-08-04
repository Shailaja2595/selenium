package open_new_window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		


	}

}
