package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_navigate 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.google.com/");
	
	Thread.sleep(1000);
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(1000);
	


	
	driver.navigate().back();
	Thread.sleep(1000);

	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	driver.close();
	
	
}
}
