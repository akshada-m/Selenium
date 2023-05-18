package DemoS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class multibroserTesting
{
	
	@Parameters("BN")
	@Test
	public void  tc1(String BN)
	{
		WebDriver driver=null;
		if (BN.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if (BN.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Documents\\Study Akshada\\firefoxdriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else 
		{
			Reporter.log("incorrect browsername",true);
		}
		
		driver.get("https://kite.zerodha.com/");
		
		
		
	}
	
}
