package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ex3 {

		public static void main(String[] args) throws IOException
		{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String name = RandomString.make(2);
		
		File dest=new File("C:\\Users\\USER\\Documents\\Study Akshada\\Screenshots\\img"+name+".jpg");	
		
     	FileHandler.copy(src, dest);
	
	
		}
}
