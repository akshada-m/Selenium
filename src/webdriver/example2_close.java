package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_close
{
   public static void main(String[] args) throws InterruptedException 
   {
	
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   
	   Thread.sleep(1000);
	   
	   driver.get("https://www.google.com/");
	   Thread.sleep(1000);
	  
	   driver.close();
	   
	   
	   
   }
}
