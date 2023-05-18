package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_getText 
{
	public static void main(String[]args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");

	ChromeDriver driver=new ChromeDriver();

	driver.get("https://en-gb.facebook.com/");

	String text=driver.findElement(By.xpath("//button[@name='login']")).getText();
	System.out.println(text);

	}

}