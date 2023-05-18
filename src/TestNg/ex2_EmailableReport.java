package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex2_EmailableReport 
{
	@Test
	public void tc2()
	{
		// sop=o/p in only console ,  reporter.log("message")-report,  reporter.log("message",true)-console+email report		
		Reporter.log("Test case2",true); 
	}
}
