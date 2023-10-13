package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileuploadDemoGuru99
{
	
	ChromeDriver driver;
	
@BeforeTest
 public void setUp()
			 {
				driver=new ChromeDriver();
				driver.get("http://demo.guru99.com/test/upload/");
				driver.manage().window().maximize();
			 }
			
@Test
 public void fileUploadTest()
			 {
		
	        WebElement uploadFile=driver.findElement(By.id("uploadfile_0"));
            uploadFile.sendKeys("C:\\Users\\My Dell\\Desktop\\JAVA PROGRAMS LUMINAR\\SELF PRACTICE\\Matrix.pdf");

	        driver.findElement(By.id("terms")).click();
            driver.findElement(By.name("send")).click();
		
		     }

}
