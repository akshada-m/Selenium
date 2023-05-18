package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_xpath_ByAttribute   
{
    public static void main(String[] args) 
    {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("yegfiwuah");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("2476165");
		
	    driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
	}
}
