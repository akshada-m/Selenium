package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex10_Assertion_verification_using_AssertClass1_AssertEquals
{
	
//	@Test                                          //fail
//	public void TC1()
//	{
//	String ActResult="hi";
//	String ExpResult="hello";
//	Assert.assertEquals(ActResult, ExpResult,"Failed");
//	}
	
	@Test                                          //pass
	public void TC1()
	{
	String ActResult="hi";
	String ExpResult="hi";
	Assert.assertEquals(ActResult, ExpResult);
	}
	
}
