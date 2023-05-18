package practise_selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class grouping 
{

	@Test(groups = "login")
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test(groups = "login")
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	
	@Test(groups = "order")
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}
	
	@Test(groups = "profile")
	public void TC4()
	{
		Reporter.log("Running TC4",true);
	}
	
	@Test(groups = "Profile")
	public void TC5()
	{
		Reporter.log("Running TC5",true);
	}
	
	@Test(groups = "fund")
	public void TC6()
	{
		Reporter.log("Running TC6",true);
	}
}
