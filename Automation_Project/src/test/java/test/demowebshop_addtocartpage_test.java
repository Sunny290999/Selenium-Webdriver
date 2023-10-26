package test;

import org.testng.annotations.Test;

import basepkg.baseclass_for_demowebshop_by_tricentis;
import pages.addtocart_page;

public class demowebshop_addtocartpage_test extends baseclass_for_demowebshop_by_tricentis
{
  @Test
  public void AddtocartPageTest() throws Exception
		          {
		            addtocart_page obj2=new addtocart_page(driver);
		            obj2.login();
		            obj2.selectcellphones();
		            obj2.cellphonespagedropdownshandling();
		            obj2.productviewmodedropdownshandling();
		            obj2.productdetailsandwishlist();
		            obj2.addtocart();
                  }
  
}