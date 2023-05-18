package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_4_getSize_of_listbox 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
    
    Thread.sleep(3000);
    
    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
    
    Select S=new Select(month);
    
   List<WebElement> alloptions = S.getOptions();
   
//   int size = alloptions.size();
//   System.out.println(size);

   int size = S.getOptions().size();
   System.out.println(size);
   
   
    
    
    
	
}
}
