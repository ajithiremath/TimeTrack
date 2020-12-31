package Com_TimeT_Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com_TimeT_Generic.BaseTest;
import Com_TimeT_Generic.ExcelData;
import Com_TimeT_Pages.actiTIMELoginPage;

public class VerifyVersion extends BaseTest
{
	@Test(priority=3)
	public void VerifyVersion()
	{
		String title=ExcelData.getdata(file_path, "TC01", 1, 2);
		actiTIMELoginPage ac = new actiTIMELoginPage(driver);
		ac.verifyTitle(title);
		String eVersion=ExcelData.getdata(file_path, "TC03", 1, 0);
		String aVersion = ac.verifyVersion();
		SoftAssert s = new SoftAssert();
	    s.assertEquals(aVersion, eVersion);
	    s.assertAll();
	}

}
