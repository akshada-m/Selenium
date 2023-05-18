package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ex11_Assertion_By_Using_SoftAssert_Class 
{
	@Test
	public void TC1()
	{
		String ActResult="ac";
		String ExpResult="abc";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(ActResult, ExpResult,"Failed first verification: ");
		
		boolean result=false;
		soft.assertFalse(result,"Failed second verification: ");
		Reporter.log("second verification completed",true);
		soft.assertAll();
		
	}

}