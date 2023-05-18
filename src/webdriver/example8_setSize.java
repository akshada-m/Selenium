package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_setSize 
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
    WebDriver d= new ChromeDriver();
    
    d.get("https://www.google.com/");
    

    Dimension s2=new Dimension(500,700);
    Thread.sleep(1000);    
    d.manage().window().setSize(s2);
    
  
}
}
