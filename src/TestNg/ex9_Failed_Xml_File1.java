package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex9_Failed_Xml_File1        //to re-run only failed test cases
{
	@Test
    public void TC1()
	{
		Reporter.log("Running Tc1", true);
	}
	@Test
    public void TC2()
	{
		Reporter.log("Running Tc2", true);
	}
	
	@Test
    public void TC3()
	{
		//Assert.fail();
		Reporter.log("Running Tc3", true);
	}
	
	@Test
    public void TC4()
	{
		Reporter.log("Running Tc4", true);
	}
	
	
	
}
