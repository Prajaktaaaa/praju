package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
// ek class banvla test cases madhe priority navacha tyat loginpage text cha sagla data copy kela
public class PriorityTest extends TestBase {
	public PriorityTest() throws IOException { //priority cha constructor aahe 
		super();
		
	}



	LoginPage login;
	
	@BeforeMethod
	public void setup() throws IOException 
	{
		initialization();
		login = new LoginPage();
		
	}
	
	@Test(enabled=false)
	public void verifyLoginPageTitleTest() 
	{
		String expZerodhaTitle = "Kite - Zerodha's fast and elegant flagship trading platform" ;
	    String actZerodhaTitle = login.verifyLoginPageTitle();
	    Assert.assertEquals(actZerodhaTitle, expZerodhaTitle);
	    Reporter.log("Title="+actZerodhaTitle);
	    	
	}
	
	@Test(enabled=false)
	public void verifyKiteLogoTest() 
	{
		boolean value = login.validateKiteLogo();
		Assert.assertEquals(value,true); 
		Reporter.log("Kite logo is" + value);
	}
	
	@Test(enabled=false)
	public void verifyZerodhaLogoTest() 
	{
		boolean value = login.ZerodhaLogo();
		Assert.assertEquals(value,true);
			
	}
		
	@Test(enabled=true,invocationCount=5)	
	public void loginZerodhaAccTest() throws InterruptedException
	{
		login.LoginZerodhaAccount ();
	}
	
	
	
	@AfterMethod
public void exit() 
{
	driver.close();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
