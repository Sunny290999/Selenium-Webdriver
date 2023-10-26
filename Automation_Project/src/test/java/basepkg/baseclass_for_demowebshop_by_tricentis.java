package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseclass_for_demowebshop_by_tricentis
{
   public static WebDriver driver;
	
     @BeforeTest
	  public void setUp()
			      {
				    driver=new ChromeDriver();
				    driver.get("https://demowebshop.tricentis.com/");
				    driver.manage().window().maximize();
			      }
	
	 @AfterTest
	  public void tearDown()
	              {
		           driver.close();
	              }
}
