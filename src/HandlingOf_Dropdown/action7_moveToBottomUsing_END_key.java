package HandlingOf_Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action7_moveToBottomUsing_END_key
{
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on create new acc btn
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//identify customised listbox
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//click on it
		
		Actions act= new Actions(driver);
		
		act.click(month).perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.END).perform();
		Thread.sleep(1000);
		
		for(int i=1;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		//press enter
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
	}
}
