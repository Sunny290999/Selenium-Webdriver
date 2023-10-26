package test;

import org.testng.annotations.Test;

import basepkg.baseclass_for_demowebshop_by_tricentis;
import pages.checkout_page;

public class demowebshop_checkoutpage_test  extends baseclass_for_demowebshop_by_tricentis
{
  @Test
  public void CheckoutPageTest() throws Exception
		          {
		            checkout_page obj3=new checkout_page(driver);   
		            obj3.login();
		            obj3.addtocart();
		            obj3.addaddress();
		            obj3.checkout();
		            obj3.orderscreenshot();
		          }
  
}