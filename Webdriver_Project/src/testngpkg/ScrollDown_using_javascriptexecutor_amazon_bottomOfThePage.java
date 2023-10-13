package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollDown_using_javascriptexecutor_amazon_bottomOfThePage
{
  ChromeDriver driver;
	
@BeforeTest
 public void setUp()
		     {
		       driver=new ChromeDriver();
			   driver.get("https://www.amazon.in/");
		     }

@Test
 public void ScrollDownTest()
		     {
		       JavascriptExecutor js=(JavascriptExecutor)driver;
		       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		       
		       driver.findElement(By.xpath("//a[@href='https://www.amazon.science']")).click();
		     }
}