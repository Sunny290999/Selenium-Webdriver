package test;

import org.testng.annotations.Test;

import basepkg.baseclass_for_demowebshop_by_tricentis;
import pages.demowebshop_page;

public class demowebshop_test extends baseclass_for_demowebshop_by_tricentis
{
  @Test
  public void DemowebshopPageTest() throws Exception
			      {
		             demowebshop_page obj5=new demowebshop_page(driver); 
		             obj5.login();
		             obj5.loginvalidation();
		             obj5.logo_verification();
		             obj5.selectcellphones();
		             obj5.cellphonespagedropdownshandling();
		             obj5.productviewmodedropdownshandling();
		             obj5.productdetailsandwishlist();
		             obj5.addtocart();
		             obj5.addaddress();
		             obj5.checkout();
		             obj5.orderscreenshot();
		             obj5.orderdetails();
			      }
  
}