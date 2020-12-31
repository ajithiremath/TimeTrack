package Com_TimeT_Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Com_TimeT_Generic.BaseTest;
import Com_TimeT_Generic.ExcelData;
import Com_TimeT_Pages.actiTIMEEnterTimeTrackPage;
import Com_TimeT_Pages.actiTIMELoginPage;

public class BuildNumberTest extends BaseTest 
{
	@Test(priority=4)
    public void buildNumberverify()
    {
		String uname=ExcelData.getdata(file_path, "TC01", 1, 0);
		String pass=ExcelData.getdata(file_path, "TC01", 1, 1);
		String t1=ExcelData.getdata(file_path, "TC01", 1, 2);
		String t2=ExcelData.getdata(file_path, "TC01", 1, 3);
		
		actiTIMELoginPage ac = new actiTIMELoginPage(driver);
		ac.verifyTitle(t1);
		ac.getUsername(uname);
		ac.getpassword(pass);
		ac.loginButton();
		
		actiTIMEEnterTimeTrackPage at = new actiTIMEEnterTimeTrackPage(driver);
		at.help();
		at.aboutYourActitime();
		
		String eBuild=ExcelData.getdata(file_path, "TC04", 1,0);
		String aBuild = at.aboutBuild();
		Assert.assertEquals(aBuild, eBuild);
		Reporter.log("buld number is same", true);
    }
}
