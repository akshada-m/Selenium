package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver= new  ChromeDriver();
	
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("oppo");
	Thread.sleep(3000);
	
	String expOption = "oppo a54";
	List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	for(WebElement option:allOptions)
	{
		String actOption = option.getText();
		if(actOption.equalsIgnoreCase(expOption))
		{
			option.click();
			break;
		}
	}
	
	
	
}
}
