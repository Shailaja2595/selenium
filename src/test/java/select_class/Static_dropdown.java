package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement static_DropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        
		 Select dropdown = new Select(static_DropDown);
		 dropdown.selectByIndex(3);
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 
		 dropdown.selectByVisibleText("AED"); 
		 System.out.println(dropdown.getFirstSelectedOption().getText());  
		 
		 dropdown.selectByValue("INR");
		 System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
