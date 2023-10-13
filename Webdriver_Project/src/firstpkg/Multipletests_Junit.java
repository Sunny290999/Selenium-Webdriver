package firstpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipletests_Junit {
	
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	
	@Test
	public void titleVerification()
	{
		
		String actualtitle=driver.getTitle();
		String exp="Google";
		
		if(actualtitle.equals(exp))
		{
			System.out.println("Actual title is correct as expected");
		}
		
		else
		{
			System.out.println("Title is not as expected");
		}
	}
	
	
	@Test
	public void pagesource()
	{

        String str=driver.getPageSource();
		
		if(str.contains("Gmail"))
				
		{
			System.out.println("Pass");
		}
		
		else
		
		{
			System.out.println("Fail");
		}
	}

	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
