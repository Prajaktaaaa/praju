package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageText extends TestBase{
	public LoginPageText() throws IOException {
		super();
		
	}



	LoginPage login;
	
	@BeforeMethod
	public void setup() throws IOException 
	{
		initialization();
		login = new LoginPage();
		
	}
	
	@Test
	public void verifyLoginPageTitleTest() 
	{
		String expZerodhaTitle = "Kite - Zerodha's fast and elegant flagship trading platform" ;
	    String actZerodhaTitle = login.verifyLoginPageTitle();
	    Assert.assertEquals(actZerodhaTitle, expZerodhaTitle); //assert use for comparison
	    Reporter.log("Title="+actZerodhaTitle); // print karaysathi use hot same as syso type
	    	
	}
	
	@Test(dependsOnMethods = "verifyLoginPageTitleTest")
	public void verifyKiteLogoTest() 
	{
		boolean value = login.validateKiteLogo(); // value reference variable madhe aapn sagl store kel
		Assert.assertEquals(value,true); 
		Reporter.log("Kite logo is" + value);
	}
	
	@Test(dependsOnMethods = "verifyLoginPageTitleTest")
	public void verifyZerodhaLogoTest() 
	{
		boolean value = login.ZerodhaLogo();
		Assert.assertEquals(value,true);
			
	}
		
	@Test	
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
