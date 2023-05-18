package DemoS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo8_multiSelectableListbox2
{
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/multiSelectableListbox.html");
	
	WebElement Selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
	
	Select s=new Select(Selectcountry);
	
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
