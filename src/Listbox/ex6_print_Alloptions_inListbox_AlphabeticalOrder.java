package Listbox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex6_print_Alloptions_inListbox_AlphabeticalOrder 
{
       public static void main(String[] args) throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
        
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select S=new Select(month);
		
		List<WebElement> alloptions = S.getOptions();
		
		TreeSet<String> tr=new TreeSet<String>();
		
		for(WebElement s1:alloptions)
		{
			String text = s1.getText();
			tr.add(text);
		}
		
		System.out.println("------print info in treeset--------");
		
		for(String s2:tr)
		{
			System.out.println(s2);
		}
	System.out.println("---------------descending order--------------------");
		Iterator<String> s3 = tr.descendingIterator();
		while(s3.hasNext())
		{
			System.out.println(s3.next());
		}
		
		
		
	}
}
