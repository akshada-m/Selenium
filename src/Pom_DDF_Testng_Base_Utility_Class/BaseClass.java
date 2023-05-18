package Pom_DDF_Testng_Base_Utility_Class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
	public void initialise_Browser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(UtilityClass.GetDataFromPC("URL"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
}
