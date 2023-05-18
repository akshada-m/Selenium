package DemoS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4_locator
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/id.html");
	
	//enter first name 
	
    driver.findElement(By.className("abc")).sendKeys("Akshada");
    
   //enter last name
    
    driver.findElement(By.className("xyz")).sendKeys("Mulik");
	
 
}
}

	
//	driver.findElement(By.name("firstName")).sendKeys("akshada");
//	driver.findElement(By.name("lastName")).sendKeys("mulik");
	


//driver.findElement(By.tagName("input")).sendKeys("Akshada");
//driver.findElement(By.tagName("input")).sendKeys("mulik");	

//driver.findElement(By.id("123")).sendKeys("akshada");
//driver.findElement(By.id("456")).sendKeys("mulik");