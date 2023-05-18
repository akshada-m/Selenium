package HandlingOf_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		//click on create new acc btn
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(4000);
		
		//identify customised listbox
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act= new Actions(driver);
		
		//click on listbox
		act.click(month).perform();
		
		//move to bottom
		for(int i=1;i<=12;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			
		}
		
		for(int i=1;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(200);
			
		}
		
		//press enter
		
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(200);
		
		}
		
		
}
