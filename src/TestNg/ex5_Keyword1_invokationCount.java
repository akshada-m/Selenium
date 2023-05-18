package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex5_Keyword1_invokationCount
{
	@Test(invocationCount = 2)
	public void TC1()
	{
		Reporter.log("running test case 1", true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("running test case 2", true);
	}
	
	
}
