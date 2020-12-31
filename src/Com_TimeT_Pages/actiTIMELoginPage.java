package Com_TimeT_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com_TimeT_Generic.BasePage;

public class actiTIMELoginPage extends BasePage
{
	 @FindBy(id="username")
	private WebElement unTB; 
	 @FindBy(id="username")
		private	WebElement unTb;
		@FindBy(name="pwd")
		private	WebElement pwTb;
		@FindBy(xpath="//div[.=\"Login \"]")
		private WebElement lnBTN;
		@FindBy(xpath="//span[.=\"Username or Password is invalid. Please try again.\"]")
		private WebElement error;
		@FindBy(xpath="//nobr[contains(.,'actiTIME 2020')]")
		private WebElement version;
		
	

		public actiTIMELoginPage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
		public void getUsername(String uname)
		{
			unTb.sendKeys(uname);
		}
		public void getpassword(String pass)
		{
			pwTb.sendKeys(pass);
		}
		public void loginButton()
		{
			lnBTN.click();
		}
		
		public String verifyErrorMessage()
		{
		verifyElement(error);
		String aError = error.getText();
		return aError;
		}
		
		public String verifyVersion()
		{
			verifyElement(version);
			String aversion=version.getText();
			return aversion;
		}

      
		
}
