package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class login_page
{
   WebDriver driver;
		
   @FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
   WebElement Loginpage;
		
   @FindBy(name="Email")
   WebElement Email;
		
   @FindBy(name="Password")
   WebElement Password;
		
   @FindBy(name="RememberMe")
   WebElement Rememberme;
		
   @FindBy(xpath="/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/input")
   WebElement Login;
		
   @FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[1]/a/img")
   WebElement Logo;

public login_page(WebDriver driver)
  {
	this.driver=driver;
    PageFactory.initElements(driver,this);
  }
		
public void login()
  {
	Loginpage.click();
	Email.sendKeys("gcvguvhv@gmail.com");
	Password.sendKeys("axbycz@#$");
	Rememberme.click();
	Login.click();
  }

public void loginvalidation()
  {
	String exp="https://demowebshop.tricentis.com/";
	String actual=driver.getCurrentUrl();
	
	Assert.assertEquals(actual,exp);
    System.out.println("\n Login validation passed");
  }
	
public void logo_verification() throws IOException
  {
    boolean logo=Logo.isDisplayed();
		
	  if(logo)
		{
		  System.out.println("\n Logo is displayed");
		  System.out.println();
		}
		
	  else
		{
		  System.out.println("\n Logo is not displayed");
		  System.out.println();
		}

	  //Screenshot of Logo👇🏻
	  File lscr=Logo.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(lscr, new File("./Screenshot/logo.png"));
  }

}