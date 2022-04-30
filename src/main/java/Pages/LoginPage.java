package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	
	//Object Repository
	@FindBy(xpath="//input[@id='userid']") private WebElement userIdTextbox;
	@FindBy(xpath="//input[@id='password']") private WebElement passwordTextBox;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginButton;
	@FindBy(xpath="//img[@alt='Kite']") private WebElement kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']") private WebElement ZerodhaLogo;
	@FindBy(xpath="//input[@type='password']") private WebElement pinTextBox;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueButton;
	@FindBy(xpath="//h2[text()='MOE840']") private WebElement userIdText;
	
	public LoginPage() throws IOException 
	{
		super();
		PageFactory.initElements(driver, this);
	}

	public String verifyPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyKiteLogo()
	{
		return kiteLogo.isDisplayed(); 	
	}
	
	public boolean verifyZerodhaLogo()
	{
		return ZerodhaLogo.isDisplayed();
	}
	
	public void loginToZerodhaAccount() throws InterruptedException
	{
		userIdTextbox.sendKeys(prop.getProperty("UserID"));
		passwordTextBox.sendKeys(prop.getProperty("Password"));
		loginButton.click();
		Thread.sleep(2000);
		pinTextBox.sendKeys(prop.getProperty("Pin"));
		continueButton.click();
		Thread.sleep(2000);
		
	}
	
  public String verifyUserIdText()
	{
	  userIdTextbox.sendKeys(prop.getProperty("UserID"));
		passwordTextBox.sendKeys(prop.getProperty("Password"));
		loginButton.click();
		return userIdText.getText();
	}
}
