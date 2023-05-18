package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex7_Keyword3_Enabled
{
	@Test
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test(enabled=false)                      //run later
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	
	@Test                          //run later
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}
	
	@Test                          //run later
	public void TC4()
	{
		Reporter.log("Running TC4",true);
	}

}
