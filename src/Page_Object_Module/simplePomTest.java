package Page_Object_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simplePomTest 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	simple_pom_without_pagefactoy sp=new simple_pom_without_pagefactoy(driver);
	sp.enterUN();
	sp.enterPwd();
	sp.ClickLogin();

	}
}
