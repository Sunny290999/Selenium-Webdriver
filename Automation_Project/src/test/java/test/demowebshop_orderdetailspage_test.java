package test;

import org.testng.annotations.Test;

import basepkg.baseclass_for_demowebshop_by_tricentis;
import pages.orderdetails_page;

public class demowebshop_orderdetailspage_test extends baseclass_for_demowebshop_by_tricentis
{
  @Test
  public void OrderdetailsPageTest() throws Exception
		          {
		            orderdetails_page obj4=new orderdetails_page(driver);  
		            obj4.login();
		            obj4.orderdetails();
		          }
  
}