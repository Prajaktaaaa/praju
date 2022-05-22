package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashBoardPage;
import Pages.LoginPage;

public class DashBoardPageTest extends  TestBase  {
	
	public DashBoardPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	DashBoardPage dash;
	LoginPage login;
	
	@BeforeMethod
	public void setup() throws InterruptedException, IOException 
	{
		initialization();
	    dash = new DashBoardPage();
	    login = new LoginPage();
	    login.LoginZerodhaAccount();
		
	}

	@Test
	public void  verifyNicknameTest() throws InterruptedException 
	{
		String value = dash.verifyNickname();
		Thread.sleep(5000);
		Assert.assertEquals(value,"Ramesh");
		
	}

	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
	
	
}
