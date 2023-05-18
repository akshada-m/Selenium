package HandlingOf_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action5_Drag_And_Drop 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(3000);
	
	WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
	
	WebElement des = driver.findElement( By.xpath("(//li[@class='placeholder'])[2]"));
	
	Actions act= new Actions(driver);
	
	//act.dragAndDrop(src, des).perform();
	
	act.moveToElement(src).clickAndHold().moveToElement(des).release().build().perform();
	
	}
}
