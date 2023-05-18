package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex4_testNg_Annotation
{
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("Browser opened", true);
	}
	@BeforeMethod
	public void LoginToApp()
	{
		Reporter.log("Login Success",true);
	}
	@Test                                                 //executed according to alphabetical order
	public void VerifyProfileName()
	{
	Reporter.log("Test case1-verified profile name",true);	
	}
	@Test
	public void AddToWishlist()
	{
		Reporter.log("Test case2-Added to wishlist",true);
	}
	@AfterMethod
	public void LogoutFromApp()
	{
		Reporter.log("Logout success", true);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("Browser closed", true);
	}
}
