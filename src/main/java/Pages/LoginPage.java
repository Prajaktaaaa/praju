package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	//object repository
	@FindBy(xpath = "//input[@label='User ID']")private WebElement userIdTextBox;
	@FindBy(xpath = "//input[@type='password']")private WebElement passwordTextBox;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginBtn;
	@FindBy(xpath = "//img[@alt='Kite']")private WebElement kiteLogo;
	@FindBy(xpath = "//img[@alt='Zerodha']")private WebElement zerodhaLogo;
	@FindBy(xpath = "//input[@label='PIN']")private WebElement pinTextBox;

//constructor
public LoginPage()throws 
IOException
{   //chromedriver cha object driver
	PageFactory.initElements(driver,this);
}


//methods
public String verifyLoginPageTitle() //WHENEVER WE CALL THIS METHOD IT WILL RETURN TITLE OF THE PAGE
{
	return driver.getTitle();      // aani te jail login page madhe tikde get karav lagel
}

public boolean validateKiteLogo() // is displayed only returns true and false value thats why we used boolean here
{
	return kiteLogo.isDisplayed();
}

public boolean ZerodhaLogo()
{
	return zerodhaLogo.isDisplayed(); 
}

public void LoginZerodhaAccount() throws InterruptedException     // call this method in the test case;
{
	userIdTextBox.sendKeys(prop.getProperty("userId"));
	Thread.sleep(1000);
	passwordTextBox.sendKeys(prop.getProperty("password"));
	Thread.sleep(1000);
	loginBtn.click();
	Thread.sleep(1000);
	pinTextBox.sendKeys(prop.getProperty("pin"));
	Thread.sleep(1000);
	loginBtn.click();
	Thread.sleep(5000);
}

}
