package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fbloginwithxmlvaluestoring {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
    @Parameters({"email","password"})
	@Test
	public void Test1(String x,String y)
	{
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys(x);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(y);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
