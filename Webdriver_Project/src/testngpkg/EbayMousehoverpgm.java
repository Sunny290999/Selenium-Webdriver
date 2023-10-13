package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class EbayMousehoverpgm
{
	ChromeDriver driver;

@BeforeTest
 public void setUp()
		  {
		    driver=new ChromeDriver();
		    driver.get("https://www.ebay.com/");			
		  }
			
@Test
 public void EbayTest1() throws Exception
          { 
	         Actions act=new Actions(driver);
		   
		     
		     WebElement Electronics=driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/a"));
             act.moveToElement(Electronics).perform();
             
             Thread.sleep(3000);
		     driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		  }
}