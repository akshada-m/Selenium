package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_SwithTo_iframe_from_mainpage
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();

	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	//driver.switchTo().frame("iframeResult");//id
	//driver.switchTo().frame("iframeResult");//name
    //driver.switchTo().frame(index);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));//webelement
	
	driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
	

}
}
