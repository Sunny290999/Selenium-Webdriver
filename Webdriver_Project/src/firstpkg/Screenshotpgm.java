package firstpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm 
{

	 ChromeDriver driver;

@Before
 public void setUp()
	      {
	 	    driver=new ChromeDriver();			
	 	  }
	 						
@Test
 public void test1() throws IOException
	 	  {
	 	    driver.get("http://www.facebook.com");
	 	   
	 	    File gscr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 	    FileHandler.copy(gscr, new File("C://My Files/Screenshot.png"));
	 	   
	 	    WebElement searchbutton=driver.findElement(By.name("login"));
	 	    File escr=searchbutton.getScreenshotAs(OutputType.FILE);
	 	    FileHandler.copy(escr, new File("./Screenshot/Fbloginbutton.png"));
	 	   
	 	   }
}