package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclick_and_Doubleclick_with_alerthandling
{
	ChromeDriver driver;
	
	
@BeforeTest
 public void setUp()
		  {
			driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		  }
		
@Test
 public void test1()
		  {
		    WebElement rightclick=driver.findElement(By.xpath("//span[ @class='context-menu-one btn btn-neutral']"));
		    
		    Actions act1=new Actions(driver);
	        
	        act1.contextClick(rightclick).perform();
	    
	      driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']")).click();
	   
	      driver.switchTo().alert().accept();
	      
		  }
	    
@Test
 public void test2()
	      {
		    WebElement doubleclick=driver.findElement(By.xpath("//button[ @ondblclick='myFunction()']"));
		    
		    Actions act2=new Actions(driver);
		    
	        act2.doubleClick(doubleclick).perform();
		 
		    Alert doubleclickalert=driver.switchTo().alert();
		    
		    String alertext=doubleclickalert.getText();
		    System.out.println("\n" + alertext);
		    System.out.println();
		    doubleclickalert.accept();
	      }

@AfterTest
 public void tearDown()
          {
	         driver.quit();
          }
}
