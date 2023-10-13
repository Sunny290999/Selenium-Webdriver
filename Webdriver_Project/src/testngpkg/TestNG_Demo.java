package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
	
	// @beforesuite
	// @beforeTest
	// @beforeclass
	// @beforemethod
	// @test
	// @aftermethod
	// @afterclass
	// @aftertest
	// @aftersuit
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("Browser open");
	}
	
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url details");
	}
	
	@Test(priority=2) //,dependsOnMethods = {"test3"})
	public void test1()
	{
		System.out.println("test 1");
	}
	
	@Test(priority=4,invocationCount=3)
	public void test2()
	{
		System.out.println("test 2");
	}
	
	@Test(priority=1,enabled=false)
	public void test3()
	{
		System.out.println("test 3");
	}
	
	@Test(priority=3)
	public void test4()
	{
		System.out.println("test 4");
	}
	
	@AfterMethod
	public void methodclose()
	{
		System.out.println("after method");
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("browser close");
	}
		
}
