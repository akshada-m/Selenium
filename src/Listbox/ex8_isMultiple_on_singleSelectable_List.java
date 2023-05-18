package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex8_isMultiple_on_singleSelectable_List
{
    public static void main(String[] args) throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(month);
		
	boolean result = s.isMultiple();
	
     if(result==true)
     {
    	 System.out.println("listbox is multiselectable");
     }
     
     else
     {
    	 System.out.println("listbox is single selectable");
     }
		
	System.out.println(s.getFirstSelectedOption().getText());
	
    }
}
