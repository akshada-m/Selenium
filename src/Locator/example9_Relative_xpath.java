package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example9_Relative_xpath
{
     public static void main(String[] args) throws InterruptedException 
     {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/demo1.html");
	Thread.sleep(2000);
	
	//click on I Agree
    driver.findElement(By.xpath("//div[3]/input[1]")).click();
    Thread.sleep(2000);
    
    //click on female
    driver.findElement(By.xpath("//div[2]/input[3]")).click();
    
   // enter username
    driver.findElement(By.xpath("//div[1]/input[1]")).sendKeys("rsrdryj");
    
    //click on link
    driver.findElement(By.xpath("//a")).click();
}
}