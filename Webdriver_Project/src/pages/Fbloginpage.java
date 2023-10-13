package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage
{
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement Fbemail;
	
	@FindBy(id="pass")
	WebElement Fbpswd;
	
	@FindBy(name="login")
	WebElement Fbloginbutton;
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void setValues(String email,String pswd)
	{
		Fbemail.sendKeys(email);
		Fbpswd.sendKeys(pswd);
	}
	
	public void loginButtonClick()
	{
		Fbloginbutton.click();
	}

}
