package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex6_Keyword2_Priority6_Variable_Decimal
{
	//priority cannot be variable
	int a=2;
	//@Test(priority=a)
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	
	//@Test(priority=1.5)
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	
}
