package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashBoardPage extends TestBase {
@FindBy(xpath = "//span [@class='nickname']")private WebElement nickname;
@FindBy(xpath = "//span [@class='user-id']")private WebElement userid;
@FindBy(xpath = "//h4 [@class='username']")private WebElement username;	
@FindBy(xpath = "//div [@class='email']")private WebElement email;	
	

public DashBoardPage ()throws 
IOException
{
	PageFactory.initElements(driver,this); //driver cha red mark kadhaysathi extend karava lagel
	
}
public String verifyNickname() 
{
	return nickname.getText();
}
public String verifyUserid() 
{
	return userid.getText();
}
public String verifyUsername()
{
	return username.getText();
}
public String verifyEmail()
{
	return email.getText();
}



}
