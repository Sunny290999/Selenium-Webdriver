package firstpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_Locator_Program 
{
	
ChromeDriver driver;

@Before
 public void setUp()
  {
	 driver=new ChromeDriver();
	 driver.get("https://app.ktu.edu.in/login.htm");			
  }
			
@Test
 public void CountofLinksTest()
  {
	 List<WebElement>linksdetials=driver.findElements(By.tagName("a"));
	 System.out.println("Total number of links are: " + linksdetials.size());
	 
	 System.out.println("\n The links are: ");
	 
	 for(WebElement link:linksdetials)
	 {
		 System.out.println("\n" + link.getText() + "----"  + link.getAttribute("href"));
     }
  }

}