package pages;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemo_Task_290923
{
    WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement SDusername;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement SDpswd;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement SDloginbutton;
	
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement Addtocartbackpack;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement Addtocartbikelight;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	WebElement Addtocartbolttshirt;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	WebElement Addtocartfleecejacket;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	WebElement Addtocartonesie;
	
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	WebElement Addtocartredtshirt;
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement Carticon;
	
	@FindBy(name="checkout")
	WebElement Checkoutbutton;
	
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement Lastname;
	
	@FindBy(xpath="//input[@placeholder='Zip/Postal Code']")
	WebElement Postalcode;
	
	@FindBy(name="continue")
	WebElement Continue;
	
	@FindBy(name="finish")
	WebElement Finish;
	
	
	@FindBy(name="back-to-products")
	WebElement Backtohome;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement Burgermenubutton;
	
	@FindBy(id="logout_sidebar_link")
	WebElement Logoutbutton;
	
public SauceDemo_Task_290923(WebDriver driver)
	 {
	    this.driver=driver;
		PageFactory.initElements(driver,this);
	 }
	
public void Login() throws Exception
	 {
		FileInputStream f=new FileInputStream("C:\\Users\\My Dell\\Downloads\\Selenium Data Driven Test Excel Documents\\Saucedemo Data Selenium,POM1.xlsx");
       
		XSSFWorkbook wb=new XSSFWorkbook(f); //workbook
        XSSFSheet sh=wb.getSheet("Sheet1");  //sheet
        
        int row=sh.getLastRowNum();  //row details
        System.out.println("\n"+"LAST ROW NUMBER: "+sh.getLastRowNum());
        
        for(int i=1;i<=row;i++)
        {
         String Username=sh.getRow(i).getCell(0).getStringCellValue();
         System.out.println("\n User Name: " +Username);
        	
         String Pswd=sh.getRow(i).getCell(1).getStringCellValue();
         System.out.println("\n Password: " +Pswd);
        	
         System.out.println();
         
         
         Thread.sleep(700);
         SDusername.sendKeys(Username);
         
         Thread.sleep(700);
         SDpswd.sendKeys(Pswd);
         
         Thread.sleep(700);
       	 SDloginbutton.click();
       	 
       	 Thread.sleep(1500);
       	 driver.navigate().refresh();
        }
	  }
	
public void Addprodtocart()
	 {
		Addtocartbackpack.click();
		Addtocartbikelight.click();
		Addtocartbolttshirt.click();
		Addtocartfleecejacket.click();
		Addtocartonesie.click();
		Addtocartredtshirt.click();
	 }
	
public void cartclickandcheckout() throws Exception
	 {
		Thread.sleep(1000);
		Carticon.click();
		
		Thread.sleep(1000);
		Checkoutbutton.click();
	 }
	
public void Fillinformation(String firstname,String lastname,String postalcode) throws Exception
	 {
		Firstname.sendKeys(firstname);
		Lastname.sendKeys(lastname);
		Postalcode.sendKeys(postalcode);
		
		Thread.sleep(1000);
		Continue.click();
		
		Thread.sleep(1000);
		Finish.click();
	  }
	
public void Backhomeandlogout() throws Exception
	 {
		Thread.sleep(1000);
		Backtohome.click();
		
		Thread.sleep(1000);
		Burgermenubutton.click();
		
		Thread.sleep(1000);
		Logoutbutton.click();
	 }

public void CloseBrowser() throws Exception
     {
	    Thread.sleep(2000);
	    driver.close();
     }
}