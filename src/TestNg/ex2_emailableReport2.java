package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex2_emailableReport2
{
	@Test
	public void TC3()
	{
		Reporter.log("hi.....!",true);
	}
	@Test
	public void TC4()
	{
		Reporter.log("Hello.....!",true);
	}
	
	
}
