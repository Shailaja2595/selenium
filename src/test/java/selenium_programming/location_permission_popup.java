package selenium_programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class location_permission_popup {

	public static void main(String[] args) {	
		
		//  How do you handle location permission popup in Selenium ?
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-geolocation");
		WebDriver driver = new ChromeDriver(options);

	  // I handle browser permission popups using browser options since Selenium cannot handle OS-level popups.

	}

}
