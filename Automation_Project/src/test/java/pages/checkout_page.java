package pages;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class checkout_page
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
   
	
   @FindBy(id="small-searchterms")
   WebElement searchfield;
	    
   @FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")
   WebElement searchbutton;
	    
   @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[2]/input")
   WebElement addtocartbutton;
   

   @FindBy(xpath="//*[@id='topcartlink']/a/span[1]")
   WebElement shoppingcart;

   @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input")
   WebElement itemquantity;
	    
   @FindBy(name="updatecart")
   WebElement updatecart;
	    
   @FindBy(name="termsofservice")
   WebElement terms;
	    
   @FindBy(name="checkout")
   WebElement checkout;
   
	    
   @FindBy(xpath="//*[@id='billing-address-select']")
   WebElement newaddr;

   @FindBy(name="BillingNewAddress.CountryId")
   WebElement country;
	    
   @FindBy(name="BillingNewAddress.City")
   WebElement city;
	    
   @FindBy(name="BillingNewAddress.Address1")
   WebElement address;
	    
   @FindBy(name="BillingNewAddress.ZipPostalCode")
   WebElement zip;
	    
   @FindBy(name="BillingNewAddress.PhoneNumber")
   WebElement phno;
	    
   
   @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/div/input")
   WebElement continuebutton;
	    
   @FindBy(xpath="//*[@id='shipping-buttons-container']/input")
   WebElement continuebutton2;
	    
   @FindBy(id="shippingoption_1")
   WebElement nextdayair;
	    
   @FindBy(xpath="//*[@id='shipping-method-buttons-container']/input")
   WebElement continuebutton3;
   
	    
   @FindBy(xpath="//*[@id='paymentmethod_2']")
   WebElement credcard;
	    
   @FindBy(xpath="//*[@id='payment-method-buttons-container']/input")
   WebElement continuebutton4;

   @FindBy(xpath="//*[@id='CreditCardType']")
   WebElement cardtype;
	    
   @FindBy(xpath="//*[@id='CardholderName']")
   WebElement cardholdername;
	    
   @FindBy(xpath="//*[@id='CardNumber']")
   WebElement cardno;
	    
   @FindBy(xpath="//*[@id='ExpireMonth']")
   WebElement expmon;
	    
   @FindBy(xpath="//*[@id='ExpireYear']")
   WebElement expyear;
	    
   @FindBy(xpath="//*[@id='CardCode']")
   WebElement code;
   
	    
   @FindBy(xpath="//*[@id='payment-info-buttons-container']/input")
   WebElement continuebutton5;
	    
   @FindBy(xpath="//*[@id='confirm-order-buttons-container']/input")
   WebElement confirmbutton;
	    
public checkout_page(WebDriver driver)
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
	
public void addtocart() throws Exception
  {
	Thread.sleep(1500);
	searchfield.sendKeys("Book");
	searchbutton.click();
		
	Thread.sleep(500);
	addtocartbutton.click();
		
	shoppingcart.click();
		
	itemquantity.clear();
	    
	Thread.sleep(500);
	itemquantity.sendKeys("2000");
	 	
	Thread.sleep(500);
	updatecart.click();
	 	
	terms.click();
	checkout.click();
  }

public void addaddress() throws Exception
  {  
	Select newaddress = new Select(newaddr);
 	newaddress.selectByVisibleText("New Address");
 	
	Select Country = new Select(country);
 	Country.selectByVisibleText("Kuwait");
 	
 	city.sendKeys("Salmiya");
 	address.sendKeys("al shaheed park");
 	zip.sendKeys("54541");
 	phno.sendKeys("1234567890");
  }
	
public void checkout() throws Exception
  {
	 Thread.sleep(1000);
	 continuebutton.click();
	 	
	 Thread.sleep(1000);
	 continuebutton2.click();
	 	
	 Thread.sleep(1500);
	 nextdayair.click();
	 	
	 Thread.sleep(1500);
	 continuebutton3.click();
	 	
	 Thread.sleep(2000);
	 credcard.click();
	 continuebutton4.click();
	 	
	 Thread.sleep(1500);
	 Select type=new Select(cardtype);
	 type.selectByVisibleText("Master card");
	 	
	 cardholdername.sendKeys("ssxsb");
	 cardno.sendKeys("5425233430109903");

	 Select expm=new Select(expmon);
	 expm.selectByValue("7");
	 	
	 Select expy=new Select(expyear);
	 expy.selectByIndex(9);

	 code.sendKeys("8719");
	 	
	 continuebutton5.click();
	  
	 Thread.sleep(2000);
	 confirmbutton.click();
  }
	
public void orderscreenshot() throws Exception
  {
	 //Order successful screenshot
	 	
	 Thread.sleep(3000);
	 File regscr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(regscr, new File("./Screenshot/orderconfirmation.png"));
	 Thread.sleep(2000);
  }

}