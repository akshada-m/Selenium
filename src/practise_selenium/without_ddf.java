package practise_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_ddf
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	
	//enter un
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
	
	//enter password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
	
	//click on login
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	
	//enter pin
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
	
	//click on continue
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	
	String expProfile = "DV1510";
	String actprofile = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	if(actprofile.equals(expProfile))
	{
		System.out.println("pass");
	
	}
	else
	{
		System.out.println("fail");
	}
	
	driver.close();
	}
}
