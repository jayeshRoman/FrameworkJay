package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageText extends TestBase {
	
	public LoginPageText() throws IOException 
	{
		super();
	}


	LoginPage log;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		log = new LoginPage();
		
    }
	
	@Test
	public void verifyPageTitleTest()
	{
		 String value = log.verifyPageTitle();
		 String ExpestedLoginPageTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		 Assert.assertEquals(value, ExpestedLoginPageTitle);
		 Reporter.log("Title of page =" + value);
	}
	
	@Test
	public void verifyKiteLogoTest()
	{
		boolean value = log.verifyKiteLogo();
		Assert.assertEquals(value, true);
		Reporter.log("KIte logo is displayed " + value );
	}
	
	@Test
	public void verifyZerodhaLogoTest()
	{
		boolean value = log.verifyZerodhaLogo();
		Assert.assertEquals(value, true);
		Reporter.log("Zerodha log is displayed = " + value );
	}
	
	@Test
	public void loginToZerodhaAccountTest() throws InterruptedException
	{
		log.loginToZerodhaAccount();
	}
	
	@Test
	public void verifyUserIdTextTest()
	{
		String value = log.verifyUserIdText();
		Assert.assertEquals(value, "MOE840");
		Reporter.log("userIdText is avaialable = " + value );
	}
	
	
	@AfterMethod
	public void exit(ITestResult it ) throws IOException
	{
		if(ITestResult.FAILURE == it.getStatus())
		{
			Utility.Util.cpatureScreenshotF(driver, it.getName());
		}
		driver.close();
	}
	
}
