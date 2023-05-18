package Handling_of_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_print_All_the_links_from_webpage 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver= new  ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));//inspect links
	System.out.println(allLinks.size());
	for(WebElement link:allLinks)
	{
		System.out.println(link.getText());
		
	}
	
	}
}
