package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex_13_grouping_class2
{
	@Test(groups="login")
	public void TC7()
	{
		Reporter.log("Running TC7",true);
	}
	@Test(groups="order")
	public void TC8()
	{
		Reporter.log("Running TC8",true);
	}
	@Test(groups="order")
	public void TC9()
	{
		Reporter.log("Running TC9",true);
	}
	@Test(groups="profile")
	public void TC10()
	{
		Reporter.log("Running TC10",true);
	}
	@Test(groups="profile")
	public void TC11()
	{
		Reporter.log("Running TC11",true);
	}
	@Test(groups="fund")
	public void TC12()
	{
		Reporter.log("Running TC12",true);
	}
}
