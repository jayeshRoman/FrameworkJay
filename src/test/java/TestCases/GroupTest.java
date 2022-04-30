package TestCases;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(priority=6,groups="Regression",invocationCount=3)
	public void method1()
	{
		System.out.println("Method1");
	}

	@Test(priority=5,groups="Sanity")
	public void method2()
	{
		System.out.println("Method2");
	}
	
	@Test(priority=4,groups={"Regression","Sanity"})
	public void method3()
	{
		System.out.println("Method3");
	}
	
	
	@Test(priority=3,groups="Sanity")
	public void method4()
	{
		System.out.println("Method4");
	}
	
	@Test(priority=2,groups="Regression")
	public void method5()
	{
		System.out.println("Method5");
	}
	
	@Test(groups={"Regression","Sanity"})
	public void method6()
	{
		System.out.println("Method6");
	}
}
