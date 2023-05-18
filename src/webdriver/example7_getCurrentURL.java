package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_getCurrentURL 
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	
	d.get("https://www.google.com/");
	
	String URL = d.getCurrentUrl();
	
	System.out.println(URL);
	
	
}
}
