package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex10_Assertion_verification_using_AssertClass4_AssertFalse
{
	
//	@Test                                                  //fail
//	public void TC1()
//	{
//	boolean ActResult=true;
//	Assert.assertFalse(ActResult,"failed");
//	}
	
	@Test                                                  //pass
	public void TC1()
	{
	boolean ActResult=false;
	Assert.assertFalse(ActResult);
	}
	

}	
