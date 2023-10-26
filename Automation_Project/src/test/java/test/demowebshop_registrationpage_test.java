package test;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.baseclass_for_demowebshop_by_tricentis;
import pages.registration_page;

public class demowebshop_registrationpage_test extends baseclass_for_demowebshop_by_tricentis
{
  @Test
  public void RegistrationPageTest() throws IOException, InterruptedException
		         {
		            registration_page obj = new registration_page(driver);
				    obj.registration();
		         }
  
}