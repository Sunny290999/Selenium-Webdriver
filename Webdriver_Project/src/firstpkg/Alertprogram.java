package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprogram 
{
	
ChromeDriver driver;

@Before
 public void setUp()
	  {
		 driver=new ChromeDriver();
		 driver.get("file:///C:/Users/My%20Dell/Downloads/html.html");			
	  }
				
@Test
 public void Alertprogramtest()
	  {
	   driver.findElement(By.xpath("//input[@onclick='display_alert()']")).click();
	 
	   Alert a=driver.switchTo().alert();
	   String alertext=a.getText();
	   System.out.println(alertext);
	   a.accept();
	   
	   
	   //notes👇
	  // a.accept(); //for accepting alert
	  // a.dismiss(); //for decline alert
	   
	   
	   driver.findElement(By.name("firstname")).sendKeys("Bibin");
	   driver.findElement(By.name("lastname")).sendKeys("S");
	   
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	  }

}
