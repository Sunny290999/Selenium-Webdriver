package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonwebsitewithxpath

{
	
ChromeDriver driver;

	
@Before
	
public void setUp()
	{
	    driver=new ChromeDriver();
		driver.get("https://www.amazon.in");			
	}
	

@Test
	
public void Test1() throws InterruptedException
	{
	  Thread.sleep(6000);
	
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
		
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_5']")).click();
		
		driver.findElement(By.xpath("//a[@href='/gp/new-releases/amazon-renewed/ref=zg_bsnr_nav_amazon-renewed_0']")).click();		
	}

}

