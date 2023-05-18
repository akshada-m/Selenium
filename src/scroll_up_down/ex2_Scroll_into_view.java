package scroll_up_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_Scroll_into_view 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	
	driver.get("http://demo.guru99.com/test/guru99home/");
	WebElement st = driver.findElement(By.xpath("//a[text()='Software Testing']"));
	//scroll until webelement is displays.
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",st);
	
	
	}
}
