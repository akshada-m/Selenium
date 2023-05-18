package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex10_getFirstSelected_ms
{
    public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
 		 WebDriver driver=new ChromeDriver(); 
 		 
 		 driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/multiSelectableListbox.html");
 		 
 	     WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));
 	     
 	     Select s=new Select(country);
 	     
 	     s.selectByIndex(4);
 	     s.selectByIndex(3);
 	     s.selectByIndex(0);
 	     
 	     WebElement Firstselected = s.getFirstSelectedOption();
 	     String text = Firstselected.getText();
 	     System.out.println("first selected option is:"+text);
 	    
 		
	}
}
