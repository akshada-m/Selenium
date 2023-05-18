package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ex1 
{
	public static void main(String[] args) throws IOException
	{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	System.out.println(src);
	
	File dest=new File("C:\\Users\\USER\\Documents\\Study Akshada\\Screenshots\\img1.jpg");
	
	FileHandler.copy(src, dest);
	
	
	
	
	}
}
