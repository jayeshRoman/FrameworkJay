package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardPageTest extends TestBase {
	
	public DashboardPageTest() throws IOException {
		super();
	}

	LoginPage log ;
	DashboardPage dash ;
	@BeforeMethod
	public void entry() throws IOException, InterruptedException {
		initialization();
	    log = new LoginPage();
	    dash = new DashboardPage();
	    log.loginToZerodhaAccount();
	    dash.userIdProfile.click();;
	    
	}
	
	@Test(priority = -3)
	public void verifyNicknameTest()
	{
	   String value = dash.verifyNickname();
	   String nickname = "Ravindra";
	   Assert.assertEquals(value, nickname);
	   Reporter.log(nickname);
	}
	
	@Test(priority = 0)
	public void verifyGoldbeesTest()
	{
		boolean value = dash.verifyGoldbees();
		Assert.assertEquals(value, true);
	}
	
	@Test(priority = 5)
	public void verifyEmailIdTest()
	{
		String value = dash.verifyEmailId();
		Reporter.log(value);
	}
	
	@Test(priority = 2)
	public void verifyFullname()
	{
		String value = dash.verifyFullname();
		Reporter.log(value);
	}
	
	@Test(priority = 1)
	public void verifyUserProfileTest()
	{
		 boolean value = dash.verifyUserProfile();
		 Assert.assertEquals(value, true);
	}
	
	@Test(priority = 3)
	public void verifyStartInvestingBtnTest()
	{
		boolean value = dash.verifyStartInvestingBtn();
		Assert.assertEquals(value, true);
	}
	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}
