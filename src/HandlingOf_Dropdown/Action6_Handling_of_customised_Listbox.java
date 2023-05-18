package HandlingOf_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Action6_Handling_of_customised_Listbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");


	
	//click on create new acount 
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3000);
	
	//step1
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
    //step2
	Actions act=new Actions(driver);
	
	//step3
	act.click(month).perform();
	
	//step4
	//A-move to top
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ARROW_UP).perform();

	Thread.sleep(2000);
	
	//B-move down
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	
	//C-press enter
	act.sendKeys(Keys.ENTER).perform();


	
	}
}
