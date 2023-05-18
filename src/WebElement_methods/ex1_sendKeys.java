package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_sendKeys 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		//enter UN
		
		//approach1
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Akshada");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		//approach2
		
		WebElement UN = driver.findElement(By.xpath("//input[@name='email']"));
		UN.sendKeys("akshada");
		UN.clear();
		
		
		
	}
}
