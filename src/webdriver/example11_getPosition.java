package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example11_getPosition
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	driver.navigate().refresh();
	
	Thread.sleep(1000);
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(1000);
	
	Point position = driver.manage().window().getPosition();
	System.out.println(position);
	
	
}
}
