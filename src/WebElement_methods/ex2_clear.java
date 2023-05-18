package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_clear
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://en-gb.facebook.com/");
    
    WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
    pwd.sendKeys("12334556");
    driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']")).click();
    Thread.sleep(2000);
    pwd.clear();
 
}
}
