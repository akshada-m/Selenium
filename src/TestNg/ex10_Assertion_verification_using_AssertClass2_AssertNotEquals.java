package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex10_Assertion_verification_using_AssertClass2_AssertNotEquals
{

//	@Test                                         //fail
//	public void TC1()
//	{
//	String ActResult="hello";
//	String ExpResult="hello";
//	Assert.assertNotEquals(ActResult, ExpResult,"Failed");
//	}
	
	
	@Test                                         //pass
	public void TC1()
	{
	String ActResult="hi";
	String ExpResult="hello";
	Assert.assertNotEquals(ActResult, ExpResult);
	}
	
}
