package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTest1 {
	@BeforeMethod
	public void setup() 
	{
		System.out.println("Before Method");
	}
	
	@Test(priority=-1)
	public void method5()
	{
		System.out.println("Method5");
	}
	@Test(priority=-100)
	public void method2() 
	{
		System.out.println("Method2");	
	}
	@Test(priority=0)
	public void method4()
	{
		System.out.println("Method4");
	}
	@AfterMethod
	public void exit() 
	{
	  System.out.println("AfterMethod");		
	}
	
}
