package practise_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_handling 
{
	public static void main(String[] args) throws InterruptedException 	
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	
	
	//create new acc
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(4000);
   
	//identify listbox
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	month.click();
	//create object of select class
	Select s= new Select(month);
	
	
	//call functions
	
	s.selectByVisibleText("Jan");
	Thread.sleep(2000);

//	s.selectByIndex(5);
//	Thread.sleep(2000);
//
//	s.selectByValue("3");
//	
	
	
	
	}
}
