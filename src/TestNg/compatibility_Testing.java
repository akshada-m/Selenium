package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class compatibility_Testing
{
	WebDriver driver=null;
	@Parameters("BN")
	@Test
	public void TC1(String BN) throws InterruptedException
	{
		
		if(BN.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}
		else if(BN.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Documents\\Study Akshada\\firefoxdriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			

		}
		else if(BN.equals("Opera"))
		{
			System.setProperty("webdievr.opera.driver","");
		    driver= new OperaDriver();
        }
		else
		{
			Reporter.log("Failed:incorrect Browsername",true);
		}
		
		driver.get("https://kite.zerodha.com/");
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		String ExpId = "DV1510";
		String UserId = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		if(UserId.equals(ExpId))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(5000);
		driver.close();
		
	
	}
}
