package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex10_Assertion_verification_using_AssertClass6_AssertNotNull
{
	
//	@Test                                                  //fail
//	public void TC1()
//	{
//	String ActResult=null;                             
//	Assert.assertNotNull(ActResult,"failed:");
//	}
	
	@Test                                                  //Pass
	public void TC1()
	{
	String ActResult="akshu";                             
	Assert.assertNotNull(ActResult);
	}
	
}