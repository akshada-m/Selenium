package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex7_multiSelectable_ListBox 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/multiSelectableListbox.html");
		
	       WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
	       
	       Select s=new Select(SelectCountry);
	      
	       boolean result = s.isMultiple();
	       System.out.println(result);
	       
	       s.selectByIndex(0);
	       s.selectByIndex(1);
	       s.selectByIndex(2);
	       
      }
}
