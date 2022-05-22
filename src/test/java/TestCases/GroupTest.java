package TestCases;

import org.testng.annotations.Test;

public class GroupTest {

	
	
	@Test(groups="Sanity")
	public void method5()
	{
		System.out.println("Method5");
	}
	@Test(groups="Regression")
	public void method2() 
	{
		System.out.println("Method2");	
	}
	@Test(groups={"Sanity","Regression"})
	public void method4()
	{
		System.out.println("Method4");
	}
	@Test(groups="Regression")
	public void method3()
	{
		System.out.println("Method3");
	}
	@Test(groups="Regression")
	public void method1()
	{
		System.out.println("Method1");
	}
	@Test(groups="Sanity")
	public void method6()
	{
		System.out.println("Method6");
	}
	
	
	
}
