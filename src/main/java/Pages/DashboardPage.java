package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase{
	
	//object Repository
		@FindBy(xpath="//span[@class='nickname']") private WebElement nicknameText;
		@FindBy(xpath="//span[@class='user-id']") public WebElement userIdProfile;
		@FindBy(xpath="//h4[@class='username']") private WebElement fullnameText;
		@FindBy(xpath="//div[@class='email']") private WebElement emailIdText;
		@FindBy(xpath="(//button[@type='button'])[1]") private WebElement startInvestingBtn;
		@FindBy(xpath="//span[text()='GOLDBEES']") private WebElement goldbees;
		
		public DashboardPage() throws IOException
		{
			super();
			PageFactory.initElements(driver, this);
		}
		
		public String verifyNickname()
		{
			return nicknameText.getText();
			
		}
		
		public boolean verifyUserProfile()
		{
			return userIdProfile.isEnabled();		
		}
		
		public String verifyFullname()
		{
			return fullnameText.getText();
		}

		public String verifyEmailId()
		{
			return emailIdText.getText();
		}
		
		public boolean verifyGoldbees()
		{
			return goldbees.isDisplayed();
		}
		
		public boolean verifyStartInvestingBtn()
		{
			return startInvestingBtn.isEnabled();
		}
}
