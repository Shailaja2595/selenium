package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		
		
		WebElement click = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
		
		for(int i=0; i<4; i++) {
			 click .click();
		}
		
		
		driver.findElement(By.xpath("(//button[@type='button'])[16]")).click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();

	}

}
