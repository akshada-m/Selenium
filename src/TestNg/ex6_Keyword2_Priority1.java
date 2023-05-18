package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex6_Keyword2_Priority1 
{
	@Test              //by default 0 priority- alphabetical
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
}
