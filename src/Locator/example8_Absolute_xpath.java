package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_Absolute_xpath
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/demo1.html");
	
	driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("adfjsdfug");
	
	driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("242652");
	
	driver.findElement(By.xpath("/html/body/div[1]/input[3]")).sendKeys("adwsgf@123");
	
	driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("1234567890");
	
	driver.findElement(By.xpath("/html/body/div[2]/input[3]")).click();
	
	driver.findElement(By.xpath("/html/body/div[3]/input[1]")).click();
	
	driver.findElement(By.xpath("/html/body/div/a")).click();
}
}

