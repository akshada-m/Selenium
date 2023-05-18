package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex6_Keyword2_Priority2
{
	@Test(priority =2)                 //low priority-execute first
	public void TC2()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test(priority=1)
	public void TC1()
	{
		Reporter.log("running TC2",true);
	}
}
