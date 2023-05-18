package Handling_of_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_select_checkboxes_in_forwardOrder_And_deselect_in_reverseOrder
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		
		driver.get("C:\\Users\\USER\\Documents\\Study Akshada\\html coding\\multiple_checkboxes.html");
		
		List<WebElement> Allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement checkbox:Allcheckboxes)
		{
			checkbox.click();
			Thread.sleep(500);
		}
		Thread.sleep(200);
		                              
		for(int i=Allcheckboxes.size()-1;i>=0;i--)
		{
			Allcheckboxes.get(i).click();
			Thread.sleep(500);
		}
		
		driver.close();
		
		
	}
}
