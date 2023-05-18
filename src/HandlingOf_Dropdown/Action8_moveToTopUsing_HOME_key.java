package HandlingOf_Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action8_moveToTopUsing_HOME_key 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//click on create new acc btn
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(4000);
	
	//identify customised listbox
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	//click
	
	Actions act=new Actions(driver);
	act.click(month);
	
	//move top
	act.sendKeys(Keys.HOME).perform();
	Thread.sleep(2000);
	
	for(int i=1;i<=6;i++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();
	}
	
	//enter
	act.sendKeys(Keys.ENTER).perform();
	

}
}
