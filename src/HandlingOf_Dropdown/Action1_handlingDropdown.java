package HandlingOf_Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1_handlingDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	//click to close login window
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
    //step 1
	WebElement dropdownLogin = driver.findElement(By.xpath("//a[text()='Login']"));
	Thread.sleep(3000);
	
	//step 2
	
	Actions act= new Actions(driver);
	
	//step 3
	act.moveToElement(dropdownLogin).perform();
	
//	//click on flipkart pluszone in dropdown
//	
//	WebElement fpz = driver.findElement(By.xpath("//div[text()='Flipkart Plus Zone']"));
//	
//	act.click(fpz).perform();
//	
	//or
	//act.moveToElement(dropdownLogin).click(fpz).build().perform();	
	}
}
