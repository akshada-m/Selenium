package practise_selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String str = RandomString.make(2);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des =new File("C:\\Users\\USER\\Documents\\Study Akshada\\Screenshots\\"+str+".jpg") ;
		
		FileHandler.copy(src, des);
		

	}
}
