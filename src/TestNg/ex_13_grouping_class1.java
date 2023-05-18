package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex_13_grouping_class1 
{
	@Test(groups="login")
	public void TC1()
	{
		Reporter.log("running TC1",true);
		
	}
	
	@Test(groups="login")
	public void TC2()
	{
		Reporter.log("running TC2",true);
		
	}
	
	@Test(groups="order")
	public void TC3()
	{
		Reporter.log("running TC3",true);
		
	}
	
	@Test(groups="fund")
	public void TC4()
	{
		Reporter.log("running TC4",true);
		
	}
	
	@Test(groups="fund")
	public void TC5()
	{
		Reporter.log("running TC5",true);
		
	}
	
	@Test(groups="profile")
	public void TC6()
	{
		Reporter.log("running TC6",true);
		
	}
	
	
}
