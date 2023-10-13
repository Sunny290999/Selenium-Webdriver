package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Validation
{
	ChromeDriver driver;
	
@BeforeTest
 public void setUp()
	         {
	         	driver=new ChromeDriver();
		        driver.get("https://www.saucedemo.com");
	         }
	
@Test
 public void LoginValidationTest()
	         {
		       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		       driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		       driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		       String exp="https://www.saucedemo.com/inventory.html";
		       String actual=driver.getCurrentUrl();
		
		       Assert.assertEquals(actual,exp);
		
		       System.out.println("Login validation passed");
		     }
}