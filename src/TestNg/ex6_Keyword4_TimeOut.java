package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex6_Keyword4_TimeOut
{
	  @Test(timeOut=5000)
	  public void TC1() throws InterruptedException
	  {
		  Thread.sleep(8000);
		  Reporter.log("Running TC1",true);
	  }
	  
	  @Test
	  public void TC2()
	  {
		  Reporter.log("Running TC2", true);
	  }
}
