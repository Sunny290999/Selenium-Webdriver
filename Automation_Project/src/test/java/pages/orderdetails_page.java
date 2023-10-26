package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderdetails_page
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
	
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[2]/a")
    WebElement orders;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div[2]/input")
    WebElement orderdetails;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[1]/a[2]")
    WebElement pdfinvoice;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement logout;

public orderdetails_page(WebDriver driver)
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

public void orderdetails() 
  {
	orders.click();
	orderdetails.click();
	pdfinvoice.click();
	logout.click();
  }

}