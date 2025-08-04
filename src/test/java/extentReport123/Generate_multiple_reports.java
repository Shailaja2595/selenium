package extentReport123;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Generate_multiple_reports 
{

	 public static void main(String[] args) throws IOException
	 {
		
		    ExtentReports ex=new ExtentReports();	
			ExtentSparkReporter sp_all            =new ExtentSparkReporter("AllTests.html");
			
			ExtentSparkReporter sp_Failed         =new ExtentSparkReporter("FailedTests.html");
			sp_Failed.filter().statusFilter().
			as(new Status[] {Status.FAIL}).apply();
			
			ExtentSparkReporter sp_SkipAndWarning =new ExtentSparkReporter("SkipAndWarningTests.html");
			sp_SkipAndWarning.filter().statusFilter().
			as(new Status[] {Status.SKIP,Status.WARNING}).apply();
			
			ex.attachReporter(sp_all,sp_Failed,sp_SkipAndWarning);

			
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
			assignDevice("Edge 98").skip("This is a passed  test");
			
		
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

			
			Throwable t=new RuntimeException("This is a custom exception");
			ex.createTest("Exception Test 2").fail(t);
			
			
	       ex.flush();
	       
	       // With the help of below code we can open automatic report 
	       Desktop.getDesktop().browse(new File("AllTests.html").toURI());
	       Desktop.getDesktop().browse(new File("FailedTests.html").toURI());
	       Desktop.getDesktop().browse(new File("SkipAndWarningTests.html").toURI());

	 }
}
