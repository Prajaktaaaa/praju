package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;//step 2 globally declare kelay baher use karta yava mhnun 
	public TestBase() throws 
IOException
	{                                        //step 1 Properties navacha class aahe ..tyala nav dilay 
	    prop = new Properties();  // aapn prop ani aapn ithe object tayar kelay...method madhe scope rahil fkt mhnun globally declare kela
		FileInputStream file = new FileInputStream("C:\\Users\\admin29\\Desktop\\dummy\\FirstMavenProject\\Config\\Config1.properties");  
		prop.load(file);
	}
	
public void initialization() throws EncryptedDocumentException, IOException 
{
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications"); //check this*****************
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");	
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url")) ;
	driver.get(Utility.Util.readExcel(0, 0));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	


}
}
