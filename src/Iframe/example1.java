package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	//click on date and time display button
	//switch to frame
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
	
	driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
	Thread.sleep(2000);
	
	//click on home icon
	//switch to main page
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	
	
	}
}
