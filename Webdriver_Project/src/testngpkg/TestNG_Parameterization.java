package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterization {
	
	@Parameters("x")
	@Test
	
	public void test1(String v)
	{
		System.out.println(v);
	}

}
