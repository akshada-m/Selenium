package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ex4
{
	public static void main(String[] args) throws IOException
	{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String name = RandomString.make(2);
	GregorianCalendar date=new GregorianCalendar();
	int dd = date.get(Calendar.DAY_OF_MONTH);
	int mm = date.get(Calendar.MONTH)+1;
	int yy = date.get(Calendar.YEAR);
	
	
	File dest=new File("C:\\Users\\USER\\Documents\\Study Akshada\\Screenshots\\"+dd+mm+yy+name+".jpg");	
	
 	FileHandler.copy(src, dest);


	}
}