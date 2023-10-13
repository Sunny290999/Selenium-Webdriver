package firstpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//driver.close();
		
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

}
