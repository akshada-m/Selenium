package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex8_Keyword5_DependsOnMethod1
{
	@Test
	public void Login()
	{
		Assert.fail();
		Reporter.log("Login tc", true);
	}
	
	@Test(dependsOnMethods= {"Login"})          // logout depend on login
	public void Logout()
	{
		Reporter.log("Logout tc", true);
	}
	
}
