package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_getTitle 
{
   public static void main(String[] args) {
	
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	   
	   WebDriver driver =new ChromeDriver();
	   
	   driver.get("https://www.google.com/");
	   
	String actTitle= driver.getTitle();
	
	if (actTitle.equals("Google"))
	{
	   System.out.println("navigated to correct page");
	  
	}
	else
	{
		System.out.println("navigated to wrong page");
	}
	
	driver.close();
	   
}
}
