package test;

import org.testng.annotations.Test;

import basepkg.Baseclass_for_FB;
import pages.Fbloginpage;

public class Fblogintest extends Baseclass_for_FB
{

@Test
 public void test()
             {
	            Fbloginpage ob=new Fbloginpage(driver);
	            ob.setValues("abc@gmail.com", "abc21345");
	            ob.loginButtonClick();
             }
}
