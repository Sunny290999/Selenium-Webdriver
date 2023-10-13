package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadUsingAutoit
{
	
ChromeDriver driver;
	
@BeforeTest
 public void setUp()
			 {
				driver=new ChromeDriver();
				driver.get("https://www.ilovepdf.com/pdf_to_word"); 
		        //driver.manage().window().maximize();
			 }
			
@Test
 public void FileUploadTestAutoit() throws Exception
			 {
		        driver.findElement(By.xpath("//*[@id='pickfiles']")).click();
		        Thread.sleep(3000);
		     
	            Runtime.getRuntime().exec("C:\\Users\\My Dell\\Documents\\ilovepdffileuploadscript.exe");
	            Thread.sleep(3000);
                
			  }

}
