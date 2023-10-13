package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontext_Verification_pgm
{
	
  ChromeDriver driver;

@Before
 public void setUp()
		  {
			driver=new ChromeDriver();			
		  }
			 						
@Test
 public void test1()
		  {
			 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			 	
			   WebElement button = driver.findElement(By.xpath("//*[contains(@value,'avail')]"));
			 	
			   System.out.println(button.getAttribute("value"));

			 	    if(button.getAttribute("value").equals("Check availability"))
			 	     {
			 	       System.out.println("Test Passed");
			 	     }
			 	    else
			 	     {
			 	       System.out.println("Test Failed");
			 	     } 
			 	  
		   }
}
