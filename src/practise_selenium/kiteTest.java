package practise_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteTest 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
		kitepage1 page1=new kitepage1(driver);
		page1.enterUN();
		page1.enterPwd();
		page1.clickOnLogin();
		
		kitepage2 page2=new kitepage2(driver);
		page2.enterPin();
		page2.clickOnContinue();
		
		kiteHomepage page3=new kiteHomepage(driver);
		page3.verifyProfile();
		
		driver.close();
			
	}
}
