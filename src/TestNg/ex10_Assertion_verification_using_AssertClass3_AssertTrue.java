package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex10_Assertion_verification_using_AssertClass3_AssertTrue
{
	
//	@Test                                                  //fail
//	public void TC1()
//	{
//	boolean ActResult=false;
//	Assert.assertTrue(ActResult,"failed");
//	}
	
	@Test
	public void TC1()
	{
	boolean ActResult=true;
	Assert.assertTrue(ActResult);
	}
	
}
