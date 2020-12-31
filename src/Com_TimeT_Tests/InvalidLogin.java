package Com_TimeT_Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Com_TimeT_Generic.BaseTest;
import Com_TimeT_Generic.ExcelData;
import Com_TimeT_Pages.actiTIMELoginPage;

public class InvalidLogin extends BaseTest
{
	@Test(priority=2)
	public void invalidLogin()
	{
		actiTIMELoginPage ac = new actiTIMELoginPage(driver);
		String title=ExcelData.getdata(file_path, "TC01", 1, 2);
		ac.verifyTitle(title);
		int r = ExcelData.getRow(file_path, "TC01");
		for(int i=1;i<r;i++)
		{
			String un = ExcelData.getdata(file_path, "TC02", i, 0);
			ac.getUsername(un);
			Reporter.log("username"+un, true);
			String pw=ExcelData.getdata(file_path, "TC02", i, 1);
			ac.getpassword(pw);
			Reporter.log("password"+pw, true);
			String aErrorMessage = ac.verifyErrorMessage();
			String eErrorMessage=ExcelData.getdata(file_path, "TC02", 1, 3);
			Assert.assertEquals(aErrorMessage, eErrorMessage);
			Reporter.log("Condition is verified",true);
			Reporter.log("========", true);
			
			
			
		}
		
		
	}
}
