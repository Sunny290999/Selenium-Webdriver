package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipletabsDemoGuru99Method2 {

	
	ChromeDriver driver;
	
	@BeforeTest
	 public void setUp()
				 {
						driver=new ChromeDriver();
						driver.get("https://demo.guru99.com/popup.php");
				 }
					
	@Test
	 public void MultipleTabTest2()
	 {
		String parentWindow=driver.getWindowHandle();  //Current Window
        
        System.out.println("Parent Window Title" + driver.getTitle());
        driver.findElement(By.xpath("/html/body/p/a")).click();
             
        Set<String> allWindowHandles=driver.getWindowHandles();
        
        for(String handle:allWindowHandles)
        {
     	   if(!handle.equalsIgnoreCase(parentWindow))
     	   {
     		   driver.switchTo().window(handle);
     		   
     		   driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("xyz@gmail.com");
               driver.findElement(By.xpath("//input[@type='submit']")).click();
     	   }
     	   driver.switchTo().window(parentWindow);
     	   
        }
 
    }

}
