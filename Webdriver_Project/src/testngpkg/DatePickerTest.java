package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickerTest
{
	
ChromeDriver driver;
	
	@BeforeTest
	 public void setUp()
		 {
	       driver=new ChromeDriver(); 
		   driver.get("https://www.booking.com/");
		 }
		
	@Test
	 public void test()
		 {
		   driver.navigate().refresh();
		   driver.findElement(By.xpath("//*[@id='indexsearch']/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]")).click();
		   
		   while(true)
		   {
			   String monthtext=driver.findElement(By.xpath("//*[@id='calendar-searchboxdatepicker']/div/div[1]/div/div[1]/h3")).getText();
			   System.out.println("month= "+monthtext);
			   
			   if(monthtext.equals("October 2023"))
			   {
				   System.out.println("Month Selected");
				   break;
			   }
			   else
			   {
				   driver.findElement(By.xpath("//*[@id='calendar-searchboxdatepicker']/div/div[1]/button")).click();
			   }
		   }
		   
		   List<WebElement> AllDates=driver.findElements(By.xpath("//*[@id='calendar-searchboxdatepicker']/div/div[1]/div/div[1]/table/tbody/tr/td/span"));
		   
		   for(WebElement DateElement:AllDates)
		   {
			   String date=DateElement.getText();
			   
			   if(date.equals("23"))
			   {
				   DateElement.click();
				   break;
			   }
		   }
		
		 }
}