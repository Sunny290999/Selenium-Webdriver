package test;

import org.testng.annotations.Test;

import basepkg.Baseclass_for_FB;
import pages.Fbcreatepage;

public class Fbcreatepagetest extends Baseclass_for_FB
{

@Test
 public void createPageTest()
	             {
		            Fbcreatepage ob1=new Fbcreatepage(driver);
		            ob1.pageClick();
		            ob1.getStartedButton();
	             }

}
