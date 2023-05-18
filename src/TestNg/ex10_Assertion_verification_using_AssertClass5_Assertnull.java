package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex10_Assertion_verification_using_AssertClass5_Assertnull
{
	@Test                                                  //fail
	public void TC1()
	{
	String ActResult="abc";
	Assert.assertNull(ActResult,"failed:");
	}

	
//	@Test                                                  //pass
//	public void TC1()
//	{
//	String ActResult=null;
//	Assert.assertNull(ActResult);
//	}
	

}	
