package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex6_Keyword2_Priority3
{
	@Test(priority=-3)                    //if  given -ve priority -low -execute first
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test(priority=-5)  
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
}
