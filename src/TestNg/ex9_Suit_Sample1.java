package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex9_Suit_Sample1
{
	@Test
	public void TC1()
	{
		Reporter.log("Running Tc1", true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Running Tc2", true);
	}
}
