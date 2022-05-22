package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {
	@Test
	public void test1() 
	{
		SoftAssert s = new SoftAssert();
		System.out.println("Test1 Started");
		s.assertEquals("Automation","Automation","fail hotay ka");
		s.assertEquals(200,200);
		System.out.println("Soft assert works for passing");
		System.out.println("****************");
		s.assertAll();
	}
	

	@Test
	public void test2() 
	{
	  SoftAssert s = new SoftAssert();
	  System.out.println("Test2 started");
	  s.assertEquals("harry","harry","fail hotay ka");
	  System.out.println("Soft assert works for passing");
	  s.assertTrue(false,"it is failing");
	  System.out.println(" soft works after failing");
	  s.assertAll();	
	}

}
