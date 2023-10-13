package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandlingpgm 
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

		 	Select day = new Select(driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]")));
		 	day.selectByVisibleText("29");
		 	  
		 	Select month = new Select(driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]")));
		 	month.selectByIndex(9);
		 	  
		 	Select year = new Select(driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]")));
		 	year.selectByValue("1999");
		 	
		 	
		 	
		Select country = new Select(driver.findElement(By.xpath("//select[@onchange='showHidecity();fieldTrack(this);checkIsdExists();']")));
		country.selectByVisibleText("India");
		 	

		   }
}