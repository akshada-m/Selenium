package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex11_getAllSelectedOptions
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/multiSelectableListbox.html");
	
	WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
	
	Select s=new Select(selectCountry);
	
	s.selectByIndex(4);
	s.selectByIndex(1);
	s.selectByIndex(0);
	
     String first = s.getFirstSelectedOption().getText();
     System.out.println(first+"=first");
  
	
	List<WebElement> allselected = s.getAllSelectedOptions();
	
	for(WebElement option:allselected)
	{
		System.out.println(option.getText());
	}
	
	}
}
