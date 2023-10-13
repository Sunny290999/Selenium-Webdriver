package testngpkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentedReports
{
	WebDriver driver;
	String baseurl="https://www.facebook.com/";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
@BeforeTest
 public void BefTest()
			 {
			   driver=new ChromeDriver();
					
			   reporter=new ExtentHtmlReporter("./Reports/myreport.html");
			   reporter.config().setDocumentTitle("Automation Report");
			   reporter.config().setReportName("Functional Test");
			   reporter.config().setTheme(Theme.DARK);
					
			   extent=new ExtentReports();
			   extent.attachReporter(reporter);
			   extent.setSystemInfo("hostname", "localhost");
			   extent.setSystemInfo("OS", "Windows 11 Home");
			   extent.setSystemInfo("Tester Name", "Sunny S");
			   extent.setSystemInfo("Browser Name", "Google Chrome");
		     }

@BeforeMethod
 public void setup()
	         {
		        driver.get(baseurl);
	         }
	
@Test
 public void FbTitleVerification()
	         {
		       test=extent.createTest("FB Title Verification");
		
		       String exp="Facebook";
		       String actual=driver.getTitle();
		       Assert.assertEquals(actual,exp);
	         }
	
@AfterMethod
 public void browserclose(ITestResult result) throws IOException
	         {
		         if(result.getStatus()==ITestResult.FAILURE)
		         {
			        test.log(Status.FAIL, "Test Case Failed is "+result.getName());
			        test.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
			
			        String screenshotpath=screenshotMethod(driver,result.getName());
			        test.addScreenCaptureFromPath(screenshotpath);
		         }
		
		         else if(result.getStatus()==ITestResult.SKIP)
		         {
			        test.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			
		         }
		
		         else if(result.getStatus()==ITestResult.SUCCESS)
		         {
			        test.log(Status.PASS, "Test Case Passed is "+result.getName());
			
		         }
	          }
	
@AfterTest
 public void tearDown()
	         {
		       extent.flush();
	         }
	
public static String screenshotMethod(WebDriver driver, String screenshotname) throws IOException 
	          {
	              File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

                  File destination=new File("./Screenshot/" + screenshotname + ".png");
                  FileUtils.copyFile(scr, destination);
    
                  return destination.getAbsolutePath();
                  
    
	
	
	
		          //File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		         // String destination="./Screenshot/" + screenshotname + ".png";
 	              //FileHandler.copy(scr, new File(destination));

		         // return destination;
	          }
	
}