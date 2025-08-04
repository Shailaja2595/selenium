package FileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) {
		
		

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.id("textbox")).sendKeys("Testing Download");
		driver.findElement(By.id("createTxt")).click();                    // generate text file
		driver.findElement(By.id("link-to-download")).click();              // display download and click
		
	}

}
