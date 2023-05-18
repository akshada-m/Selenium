package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_maximize
{
   public static void main(String[] args) throws InterruptedException {
	
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	   
	   WebDriver driver=new ChromeDriver();
	   Thread.sleep(3000);
	   
	  Point p=new Point(50,80);
	  driver.manage().window().setPosition(p);
	   
}
}
