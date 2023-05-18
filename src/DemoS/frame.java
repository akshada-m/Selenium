package DemoS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe ");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	//click me to disply date and time
	//switch to iframe
	
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
	
	Thread.sleep(3000);
	
	//click on home icon
	
	driver.switchTo().defaultContent();
	//or
	//driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	}
}
