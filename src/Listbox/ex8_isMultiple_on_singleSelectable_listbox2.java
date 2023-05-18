package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex8_isMultiple_on_singleSelectable_listbox2
{
      public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/sample4.html");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='123']"));
		
		Select s= new Select(country);
		
		boolean result = s.isMultiple();
		
		System.out.println(result);
		if(result==true)
		{
		System.out.println("listbox is multi selectable");
		}
		else
		{
			System.out.println("listbox is single selectable");
		}
	
	}
}
