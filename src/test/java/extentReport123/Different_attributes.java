package extentReport123;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Different_attributes 
{

	public static void main(String[] args) throws IOException
	{
		ExtentReports ex=new ExtentReports();
		File file=new File("attribute.html");
		ExtentSparkReporter sp=new ExtentSparkReporter(file);
		ex.attachReporter(sp);

		
		ex.createTest("Test 1" , "Test desc").
		assignAuthor("Shailaja").
		assignCategory("Smoke").
		assignDevice("Chrome 99").
		pass("This is a passed  test") ;
		
		ex.createTest("Test 2" , "Test desc").
		assignAuthor("Subhash").
		assignCategory("Sanity").
		assignDevice("Edge 99").
		fail("This is a failed  test") ;
	
		ex.createTest("Test 3" , "Test desc").
		assignAuthor("Subhash").
		assignAuthor("Hogale").
		assignCategory("Sanity").
		assignCategory("Regression").
		assignDevice("Edge 99").
		assignDevice("Edge 98").
		pass("This is a passed  test") ;
	
		ex.createTest("Test 4" , "Test desc").
		assignAuthor("Subhash","Khandekar","Shailaja").
		assignCategory("Sanity","Smoke","Retesting").
		assignDevice("Edge 99","Chrome97","Firefox 88").
		pass("This is a passed  test") ;


		ex.createTest("Test 5" , "Test desc").
		assignAuthor(new String[]{"Subhash","Khandekar","Shailaja"}).
		assignCategory(new String[]{"Sanity","Smoke"}).
		assignDevice(new String[]{"Edge 99","Chrome97","Firefox 88"}).
		pass("This is a passed  test") ;

		
       ex.flush();
       
       // With the help of below code we can open automatic report 
       Desktop.getDesktop().browse(new File("attribute.html").toURI());
	}

}
