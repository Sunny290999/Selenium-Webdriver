package firstpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpathprogram {
	
ChromeDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	

	@Test
	public void Test1()
	{
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("xyz");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}