package Actions_class;

import java.util.HashSet;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class duplicate_options_dropdown {

	public static void main(String[] args) {

       WebDriver driver = new ChromeDriver();
       driver.get("");
       
       Select select = new Select(driver.findElement(By.id("dropdownId")));
   java.util.List<WebElement> options = select.getOptions();

       Set<String> unique = new HashSet<>();
       for (WebElement option : options) {
           if (!unique.add(option.getText())) {
               System.out.println("Duplicate option found: " + option.getText());
           }
       }


	}

}
