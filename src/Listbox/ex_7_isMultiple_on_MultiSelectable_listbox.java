package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_7_isMultiple_on_MultiSelectable_listbox
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/multiSelectableListbox.html");
	
       WebElement SelectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
       
       Select s=new Select(SelectCountry);
      
       
       boolean result = s.isMultiple();
       System.out.println(result);
       
       if(result==true)
       {
    	   System.out.println("listbox is mutiselectable");
       }
       
       else
       {
    	   System.out.println("list box is single selectable");
       }
   
	
	
}
}
