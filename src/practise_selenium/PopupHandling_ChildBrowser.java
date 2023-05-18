package practise_selenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling_ChildBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		
		//click on new window
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String>al=new ArrayList<String>(ids);
	    String mainPageId = al.get(0);
	    String ChildWindowId = al.get(1);
	    
	   driver.switchTo().window(ChildWindowId).close();
	  
	   driver.switchTo().window(mainPageId);
	   
	   
	   
		
		
	}
}
