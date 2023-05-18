package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex6_Keyword2_Priority5
{   
	@Test
	public void TC2()             //priority=0
	{
		Reporter.log("running TC2",true);
	}
	
	@Test(priority=1)
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
}
