package Multiple_windows_tabs;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Muliple_window_getSize {

	public static void main(String[] args) {
		
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://example.com");
	     driver.manage().window().maximize();
		
                // Store the main window handle
                String mainWindow = driver.getWindowHandle();

                // Open a new tab/window using JavaScript
                ((JavascriptExecutor) driver).executeScript("window.open('https://google.com', '_blank');");
                ((JavascriptExecutor) driver).executeScript("window.open('https://bing.com', '_blank');");

                // Get all window handles
                Set<String> allWindows = driver.getWindowHandles();

                // Loop through windows
                for (String window : allWindows) {
                    driver.switchTo().window(window);
                    String title = driver.getTitle();
              org.openqa.selenium.Dimension size = driver.manage().window().getSize();

                    System.out.println("Title: " + title);
                    System.out.println("Width: " + size.getWidth() + ", Height: " + size.getHeight());
                    System.out.println("-----------");
                }

                // Close all windows
                driver.quit();
            }

	

}
