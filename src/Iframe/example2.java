package Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
    
    
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    
//    driver.switchTo().frame("iframeResult");
    
//    driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
//    
    
	}
}
