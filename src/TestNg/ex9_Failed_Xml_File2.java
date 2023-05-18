package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex9_Failed_Xml_File2
{
	@Test
	public void TC7()
	{
		Reporter.log("Running TC7",true);
	}
	
	@Test
	public void TC8()
	{
		//Assert.fail();                           //re-run
		Reporter.log("Running TC8",true);
	}
	
	@Test
	public void TC9()
	{
		//Assert.fail();                             //re-run
		Reporter.log("Running TC9",true);
	}
	
	@Test
	public void TC10()
	{
		Reporter.log("Running TC10",true);
	}
	
}
