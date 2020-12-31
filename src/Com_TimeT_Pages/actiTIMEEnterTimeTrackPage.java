package Com_TimeT_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com_TimeT_Generic.BasePage;

public class actiTIMEEnterTimeTrackPage extends BasePage
{

	@FindBy(id="logoutLink")
	private WebElement lgoBTN;
	
	@FindBy(xpath="//tbody/tr[2]/td[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]")
	private WebElement help;
	
	@FindBy(xpath="//a[.=\"About your actiTIME\"]")
	private WebElement aboutYourActitime;
	
	@FindBy(xpath="//span[contains(text(),'(build 1405_20)')]")
	private WebElement buildNumber;
	
	public actiTIMEEnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	public void logoutclick()
	{
		lgoBTN.click();
	}
	
	  public void help()
      {
           help.click();
      }
		public void aboutYourActitime()
		{
			aboutYourActitime.click();
		}
		public String aboutBuild()
		{
			verifyElement(buildNumber);
			String bn = buildNumber.getText();
			return bn;
		}
}
