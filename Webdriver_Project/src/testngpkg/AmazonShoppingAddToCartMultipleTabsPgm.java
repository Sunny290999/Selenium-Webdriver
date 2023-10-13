package testngpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonShoppingAddToCartMultipleTabsPgm {
	
ChromeDriver driver;
	
@BeforeTest
 public void setUp()
			 {
			    driver=new ChromeDriver();
				driver.get("https://www.amazon.in");
				driver.manage().window().maximize();
			 }
					
@Test
 public void Test1()
	         {
		       driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Mobiles");
		       driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		     String parentWindow=driver.getWindowHandle();
		   
             driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
             
        Set<String> allWindowHandles=driver.getWindowHandles();
        
        for(String handle:allWindowHandles)
        {
     	   if(!handle.equalsIgnoreCase(parentWindow))
     	   {
     		   driver.switchTo().window(handle);
     		   
     		   driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
     		   
     		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")));
		        
               driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
     	   }
     	   
        }
		
		
		
		
		
	 }

}
