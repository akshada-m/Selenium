package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/name.html");
	
	driver.findElement(By.name("firstName")).sendKeys("akshada");
	
	driver.findElement(By.name("lastName")).sendKeys("mulik");
}
}