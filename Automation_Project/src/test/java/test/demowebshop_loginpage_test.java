package test;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.baseclass_for_demowebshop_by_tricentis;
import pages.login_page;

public class demowebshop_loginpage_test extends baseclass_for_demowebshop_by_tricentis
{
  @Test
  public void LoginPageTest() throws IOException
		          {
		             login_page obj1=new login_page(driver);
                     obj1.login();
			         obj1.loginvalidation();
			         obj1.logo_verification();
		          }
  
}