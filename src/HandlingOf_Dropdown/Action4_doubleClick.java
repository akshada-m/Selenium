package HandlingOf_Dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action4_doubleClick 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(2000);
		//double click me button
		WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act= new Actions(driver);
		
		//act.doubleClick(element).perform();
		
		
		//or
		
		act.moveToElement(element).doubleClick().build().perform();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		
	}
}
