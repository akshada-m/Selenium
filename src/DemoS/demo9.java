package DemoS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo9 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	driver.close();

	WebDriver driver1=new ChromeDriver();
	driver1.navigate().to("https://en-gb.facebook.com/");
	}
}
