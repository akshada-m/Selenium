package DemoS;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class takescreenshotOfAlert 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();	
		
		driver.get("https://demoqa.com/alerts");
		try 
		{
			driver.findElement(By.xpath("//button[@id='alertButton']")).click();
			Thread.sleep(2000);
		}
		
		catch (Exception a) 
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File Dest=new File("C:\\Users\\USER\\Documents\\Study Akshada\\Screenshots\\AlertSS.jpg");
			
			FileHandler.copy(src, Dest);
		}
		
		
	}
}
