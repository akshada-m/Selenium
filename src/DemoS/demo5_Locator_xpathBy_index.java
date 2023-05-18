package DemoS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5_Locator_xpathBy_index 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("(//input[contains(@class,'inputtext _55r1')])[2]")).sendKeys("sdge");
	
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("akshuu");

driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("mulik");


}
}
