package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addtocart_page
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
	
	
    @FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a")
    WebElement Electronics;
	
    @FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/ul/li[2]/a")
    WebElement Cellphones;
    
    @FindBy(id="products-orderby")
	WebElement Sortby;
    
    @FindBy(id="products-viewmode")
   	WebElement Viewmode;
    
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/h2/a")
    WebElement smartphone;
    
    @FindBy(id="addtocart_43_EnteredQuantity")
   	WebElement quantity;
    
    @FindBy(id="add-to-wishlist-button-43")
   	WebElement addtowishlist;
    
    
    @FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")
    WebElement wishlist;
    
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/table/tbody/tr/td[6]/input")
    WebElement editquantity;
    
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/div/div/input[1]")
    WebElement updatewishlist;
    
    @FindBy(name="removefromcart")
	WebElement remove;
    
    
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
  
public addtocart_page(WebDriver driver)
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

public void selectcellphones()
  {
	Actions act=new Actions(driver);
    act.moveToElement(Electronics).perform();
    Cellphones.click();
  }
	 
public void cellphonespagedropdownshandling() throws Exception
  {
	Thread.sleep(500);
	Select sort = new Select(Sortby);
 	sort.selectByVisibleText("Name: A to Z");
  }

public void productviewmodedropdownshandling() throws Exception
  {
	Thread.sleep(500);
	Select viewmode = new Select(Viewmode);
 	viewmode.selectByVisibleText("List");
  }

public void productdetailsandwishlist() throws Exception
  {
	Thread.sleep(500);	
	smartphone.click();
    quantity.clear();
	quantity.sendKeys("23");
	addtowishlist.click();
	
	Thread.sleep(1000);
	wishlist.click();
  }

public void addtocart() throws Exception
  {
	Thread.sleep(500);
	editquantity.clear();
	editquantity.sendKeys("100");
	
	Thread.sleep(500);
	updatewishlist.click();
	
	Thread.sleep(1500);
	remove.click();
	
	Thread.sleep(1000);
	updatewishlist.click();
	
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

}