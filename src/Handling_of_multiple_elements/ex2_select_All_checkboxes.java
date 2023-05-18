package Handling_of_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_select_All_checkboxes

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();	
		
		driver.get("C:\\Users\\USER\\Documents\\Study Akshada\\html coding\\multiple_checkboxes.html");
		
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));//multiple matching element
		
		for(WebElement checkbox:allcheckboxes)
		{
			checkbox.click();
			Thread.sleep(500);
		}
	}
}
