package Com_TimeT_Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

abstract public class BaseTest implements AutoConstant
{
	{
		System.setProperty(chrome_Key, chrome_Value);
		System.setProperty(fire_Key, fire_Value);
	}
	public static WebDriver driver;
	@BeforeMethod
 public void preCondition()
{
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("https://demo.actitime.com");
	
}
	@AfterMethod
public void postCondition(ITestResult res)
{
		int status = res.getStatus();
		if(status==2)
		{
			String name = res.getName();
			GenericUtils.getScreenshot(driver, name);
		}
	    driver.close();
}
}
