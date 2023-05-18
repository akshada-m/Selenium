package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex8_Keyword5_DependsOnMethod2
{
	@Test
	public void Login()
	{
		
		Reporter.log("Login tc", true);
	}
	
	@Test
	public void Login1()
	{
		Assert.fail();
		Reporter.log("Login1 tc", true);
	}
	
	
	@Test(dependsOnMethods= {"Login"})          // logout depend on login1
	public void Logout()
	{
		Reporter.log("Logout tc", true);
	}
}
