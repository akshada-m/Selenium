package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex3_TestNg_Annotations
{
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("Browser open sucessfully",true);
	}
	
	
	@BeforeMethod                //precondition before test case
	public void LoginToApp()
	{
		Reporter.log("Login success",true);
	}
	@Test
	public void verifyProfileName()
	{
		Reporter.log("Test case-Running verify profile name",true);
	}
	
	@AfterMethod                  //postcondition
	public void LogoutFromApp()
	{
		Reporter.log("logout success",true);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("browser closed",true);
	}
	
}
