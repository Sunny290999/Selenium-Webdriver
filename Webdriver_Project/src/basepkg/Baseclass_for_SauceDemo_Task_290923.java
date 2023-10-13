package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Baseclass_for_SauceDemo_Task_290923
{
	public static WebDriver driver;
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
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
		}
}
