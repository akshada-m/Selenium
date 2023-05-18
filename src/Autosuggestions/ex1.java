package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:/Users/USER/Downloads/chromedriver111.exe");
	WebDriver driver= new  ChromeDriver();
	
	
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
	
	Thread.sleep(2000);
	String expOpion = "redmi note 10";
	List<WebElement> AllOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	
	for(WebElement option:AllOptions)
	{
		String actOption = option.getText();
		if(actOption.contentEquals(expOpion))
		{
			option.click();
			break;
		}
	}
	
}
}
