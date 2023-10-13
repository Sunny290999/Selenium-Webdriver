package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practicewithebaysite
{
	WebDriver driver;
	
@Parameters("browser")
@BeforeTest
 public void setUp(String browser)
	 {
	   
	   if(browser.equalsIgnoreCase("chrome"))
	   {
	     driver=new ChromeDriver();
	   }

	   else if(browser.equalsIgnoreCase("firefox"))
	   {
	    driver=new FirefoxDriver();
	   }
	
	   else
	   {
	     driver=new EdgeDriver();
	   }
	   
		
		driver.get("https://www.ebay.com/");
	 }
	
@Test
 public void Test1()
	 {
		List<WebElement>countoflinks=driver.findElements(By.tagName("a"));
		System.out.println("\n Total number of links are: " + countoflinks.size());
	 }

@Test
 public void Test2()
	 {
		WebElement ButtonElement=driver.findElement(By.xpath("//input[@value='Search']"));
		boolean EnableState=ButtonElement.isEnabled();
				
	     if(EnableState) 
		 {
	       System.out.println("\n Search button is enabled");
	     }
	     
	     else 
	     {
	       System.out.println("\n Search button is not enabled");
	     }
	 }
	
@Test
 public void Test3()
	 {
         boolean logo=driver.findElement(By.xpath("//img[@alt='eBay Home']")).isDisplayed();
		
		  if(logo)
		  {
		    System.out.println("\n Ebay logo is displayed");
		  }
		
		  else
		  {
		    System.out.println("\n Ebay logo is not displayed");
		  }
	  }
	

@Test
 public void Test4()
	 {
       String str=driver.getPageSource();
		
		 if(str.contains("Daily Deals"))
		 {
		   System.out.println("\n Daily Deals text is present");
		   System.out.println();
		 }
		
		 else
		 {
		   System.out.println("\n Daily Deals text is not present");
		   System.out.println();
		 }
		
	  }

@AfterTest
 public void tearDown()
     {
	    driver.quit();
     }
}