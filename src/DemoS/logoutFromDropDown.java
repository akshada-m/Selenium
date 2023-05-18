package DemoS;

import java.util.concurrent.TimeUnit;

import org.apache.xml.security.stax.ext.XMLSecurityConstants.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class logoutFromDropDown 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("akshadamulik450@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akshu@7215");
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	WebElement dropdown = driver.findElement(By.xpath("//div[text()='Akshada']"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(dropdown).perform();;
	
	WebElement logout = driver.findElement(By.xpath("//div[text()='Logout']"));
	
	//act.moveToElement(logout).perform();
	
	//act.click().perform();
	//Thread.sleep(2000);
	
	//System.out.println("logout from flipkart");
	
	
	
	
}
}
