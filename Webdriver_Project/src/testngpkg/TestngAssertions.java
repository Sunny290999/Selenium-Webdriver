package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAssertions {
	
	ChromeDriver driver;
	
	@BeforeTest
	 public void setUp()
				 {
					driver=new ChromeDriver();
					driver.get("https://www.facebook.com/"); 
				 }
				
	@Test
	 public void fbtitleverification()
	 {
		String exp="Facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(exp, actual);
		
	 }

}
