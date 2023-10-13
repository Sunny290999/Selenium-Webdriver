package test;

import org.testng.annotations.Test;

import basepkg.Baseclass_for_SauceDemo_Task_290923;
import pages.SauceDemo_Task_290923;

public class SauceDemo_Task_290923_Test extends Baseclass_for_SauceDemo_Task_290923
{
	
@Test
 public void test() throws Exception
	         {
	            SauceDemo_Task_290923 ob2=new SauceDemo_Task_290923(driver);
	             
	            ob2.Login();
	            ob2.Addprodtocart();
	            ob2.cartclickandcheckout();
	            ob2.Fillinformation("abc","xyz","012345");
	            ob2.Backhomeandlogout();
	            ob2.CloseBrowser();
	         }
}
