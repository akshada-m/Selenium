package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_isEnabled 
{
	public static void main(String[]args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");

	ChromeDriver driver=new ChromeDriver();

	driver.get("https://en-gb.facebook.com/");

	boolean result=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
	System.out.println(result);
	if(result==true)
	{
	System.out.println("button enabled");
	}
	else
	{
	System.out.println("button disabled");
	}
	}



}
