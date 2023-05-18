package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ex2 
{
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\USER\\Documents\\Study Akshada\\Screenshots\\img2.jpg");
		
		FileHandler.copy(src, dest);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
	    File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    File dest1=new File("C:\\Users\\USER\\Documents\\Study Akshada\\Screenshots\\img3.jpg");
	    
	    FileHandler.copy(src1, dest1);
	    
	}
}
