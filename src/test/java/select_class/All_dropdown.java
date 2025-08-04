package select_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_dropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement dropCountry = driver.findElement(By.xpath("//select[@id='country']"));
		Select sel = new Select(dropCountry);

		// capture the options from dropdown
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		System.out.println("number of options in adrop down : " + size);

		sel.selectByIndex(size - 1);

		// printing the options
//		for (int i = 0; i < size; i++) {
//
//			String all_value = options.get(i).getText();
//			System.out.println(all_value);
//
//		}

		// enhanced for loop

   for(WebElement op :  options) 
   {
	   System.out.println(op.getText());
   }
   
	}

}
