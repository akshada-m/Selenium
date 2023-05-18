package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_1_select_day
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(3000);
		
		//click on create new acc button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
//date
		//step 1:find listbox element and store it in variable
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));

		//step 2:create object of select class pass that variable in constructor of select class
		Select s=new Select(day);

		//step 3:
		 s.selectByVisibleText("31");
         //s.selectByValue("31");
        // s.selectByIndex(31);
		
		 
	}	


}
