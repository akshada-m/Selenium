package DemoS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_handling 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new  ChromeDriver();
	driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
	
	//click on create  new account btn
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3000);
	
	//find listbox ele
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s=new Select(month) ;
	
	s.selectByVisibleText("Jan");
//	s.selectByIndex(0);
//	s.selectByValue("");
	
	
	
	}
}
