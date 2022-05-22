package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionTest {
	@Test
	public void method5() 
	{
		System.out.println("Method5");
		Assert.assertEquals("Java","Java","if fails then display");
	}
	
	@Test
	public void method2()
	{
		System.out.println("Method2");
		Assert.assertEquals(400, 200,"Failed method2 printing");
		System.out.println("Is method 2 printing is failing");
	}
    @Test(groups="Regression")
	public void method44() 
	{
		System.out.println("Method44");	
		Assert.assertTrue(true);
	}
	@Test
	public void method3()
	{
		System.out.println("Method3");
		Assert.assertTrue(false);
	}
	@Test
	public void method1()
	{
		System.out.println("Method1");
		Assert.assertFalse(false);
	}	
	@Test
	public void method11()
	{
		System.out.println("Method11");
		Assert.assertFalse(true);
	}
	
}
