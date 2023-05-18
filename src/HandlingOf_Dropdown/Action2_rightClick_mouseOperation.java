package HandlingOf_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2_rightClick_mouseOperation 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		WebElement rightclickbtn = driver.findElement(By.xpath("//span[text()='right click me']"));
	
		Actions act= new Actions(driver);
		
		//act.contextClick(rightclickbtn).perform();
		
		//or
		
		act.moveToElement(rightclickbtn).contextClick().build().perform();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		driver.switchTo().alert().accept();
	}
}
