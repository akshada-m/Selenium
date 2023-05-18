package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex6_Keyword2_Priority4
{
	@Test(priority=1)              //Duplicate priority- alphabetical -tc1,tc2
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test(priority=1)
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
}
