package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDropPgm
{
	
   ChromeDriver driver;
	
@BeforeTest
 public void setUp()
		 {
			driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
		 }
		
@Test
 public void dragAndDroptest()
		 {
		
		 Actions act=new Actions(driver);
		
		WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
        
        act.dragAndDrop(From, To).build().perform();	
        
        
        
		WebElement From2=driver.findElement(By.xpath("//*[@id='fourth']/a"));			
        WebElement To2=driver.findElement(By.xpath("//*[@id='amt7']/li"));
        
        act.dragAndDrop(From2, To2).build().perform();
        
        
        
        WebElement From3=driver.findElement(By.xpath("//*[@id='credit1']/a"));
        WebElement To3=driver.findElement(By.xpath("//*[@id='loan']/li"));
        
        act.dragAndDrop(From3, To3).build().perform();
        
        
        
        WebElement From4=driver.findElement(By.xpath("//*[@id='fourth']/a"));
        WebElement To4=driver.findElement(By.xpath("//*[@id='amt8']/li"));
        
        act.dragAndDrop(From4, To4).build().perform();
        
        
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='equal']/a")));
       
        
        
        System.out.println("\n" + driver.findElement(By.xpath("//*[@id='equal']/a")).getText());
        
        
        String str=driver.getPageSource();
		
		if(str.contains("Perfect!"))
				
		{
			System.out.println("\n" + "Pass");
		}
		
		else
		
		{
			System.out.println("\n" + "Fail");
		}
		
		System.out.println();

		
		
         }
}