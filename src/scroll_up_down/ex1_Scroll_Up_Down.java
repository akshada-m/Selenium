package scroll_up_down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_Scroll_Up_Down
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/guru99home/");
	//to scroll down
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
	//to scroll up
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
	//to scroll right 
	((JavascriptExecutor)driver).executeScript("window.scrollBy(1000,0)");
	Thread.sleep(3000);
	//to scroll left
	((JavascriptExecutor)driver).executeScript("window.scrollBy(-500,0)");
	
	
	}
}
