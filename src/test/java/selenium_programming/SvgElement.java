package selenium_programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgElement {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
         driver.get("https://testautomationpractice.blogspot.com/");
                                                         // parent      //child
       String circle = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='circle']")).getDomAttribute("fill");
       System.out.println(circle);
       
       String rectangle = driver.findElement(By.xpath("//*[local-name()='rect']")).getDomAttribute("fill");
       System.out.println(rectangle);
       
       String triangle = driver.findElement(By.xpath("//*[local-name()='polygon']")).getDomAttribute("fill");
       System.out.println(triangle);
       
       
	}

}
