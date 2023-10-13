package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffbuttonandradiobuttonenableordisable
{
	
  ChromeDriver driver;
	
@BeforeTest
 public void setUp()
	 {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 }
	
@Test
 public void test1()
	 {
		WebElement radioElement=driver.findElement(By.xpath("//input[@value='m']"));
		boolean SelectState=radioElement.isSelected();
				
	
		if(SelectState==true) 
		{
		  System.out.println("Radiobutton is working");
		}
	     
		else 
	    {
	      System.out.println("Radiobutton is not working");
	    }
	
	  }
	
@Test
 public void test2()
	{
		WebElement buttonElement = driver.findElement(By.xpath("//input[@id='Register']"));
		boolean EnableState = buttonElement.isEnabled();
				
	
		 if(EnableState) 
		 {
	       System.out.println("Button is enabled");
	     }
	     else 
	     {
	       System.out.println("Button is not enabled");
	     }
		
	 }
}
