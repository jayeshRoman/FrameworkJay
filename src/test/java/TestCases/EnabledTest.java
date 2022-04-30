package TestCases;

import org.testng.annotations.Test;

public class EnabledTest {
	
	@Test(priority=6,groups="Regression",enabled=true)
	public void method111()
	{
		System.out.println("Method11");
	}

	@Test(priority=5,groups="Sanity",enabled=true)
	public void method22()
	{
		System.out.println("Method22");
	}
	
	@Test(priority=4,groups={"Regression","Sanity"},enabled=false)
	public void method33()
	{
		System.out.println("Method33");
	}
	
	
	@Test(priority=3,groups="Sanity",enabled=true)
	public void method44()
	{
		System.out.println("Method44");
	}
	
	@Test(priority=2,groups="Regression",enabled=false)
	public void method55()
	{
		System.out.println("Method55");
	}
	
	@Test(groups={"Regression","Sanity"},enabled=true)
	public void method66()
	{
		System.out.println("Method66");

}
}
