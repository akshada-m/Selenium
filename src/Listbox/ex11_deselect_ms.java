package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex11_deselect_ms {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/multiSelectableListbox.html");
	
	WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
	
	Select s=new Select(selectCountry);
	
	s.selectByIndex(2);
	s.selectByIndex(1);
	s.selectByIndex(0);
	
//	s.deselectByIndex(0);
//	Thread.sleep(2000);
//	s.deselectByIndex(1);
//	Thread.sleep(2000);
//	s.deselectByIndex(2);
	
	Thread.sleep(2000);
	s.deselectAll();
	}
}
