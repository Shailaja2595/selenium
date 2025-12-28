package Automation_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobile_num {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> numbers = driver.findElements(By.id("email"));
		int valid = 0, invalid = 0;

		for (WebElement num : numbers) {
		    String mobile = num.getText();
		    if (mobile.matches("\\d{10}")) {
		        valid++;
		    } else {
		        invalid++;
		    }
		}
		System.out.println("Valid: " + valid + " Invalid: " + invalid);

	}

}
