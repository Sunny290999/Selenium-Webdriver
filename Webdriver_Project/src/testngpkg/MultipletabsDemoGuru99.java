package testngpkg;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipletabsDemoGuru99
{
	ChromeDriver driver;
	
@BeforeTest
 public void setUp()
			 {
					driver=new ChromeDriver();
					driver.get("https://demo.guru99.com/popup.php");
			 }
				
@Test
 public void MultipleTabTest1()
			 {
	           
	           String mainWindowHandle=driver.getWindowHandle();
	           
	           driver.findElement(By.xpath("/html/body/p/a")).click();
	                
	           Set<String> allWindowHandles=driver.getWindowHandles();
	           Iterator<String> iterator=allWindowHandles.iterator();
	                
	           while(iterator.hasNext())
	                {
	                    String ChildWindow=iterator.next();
	                        
	                       if(!mainWindowHandle.equalsIgnoreCase(ChildWindow))
	                         {
	                    	   driver.switchTo().window(ChildWindow);
	                    	   
	                           driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("xyz@gmail.com");
	                           driver.findElement(By.xpath("//input[@type='submit']")).click();
	                           
	                         }
	                }
	           }

}