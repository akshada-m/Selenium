package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_alert_popup 
{
	//features:we cannot inspect element ,it contains ok & cancel buttons,text.It also contains '?' & !
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe")	;
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	
	//click on click me button
	
	driver.findElement(By.xpath("//button[text()='Click me!']")).click();
	Thread.sleep(2000);
	
	//switch to alert popup
	
	Alert alt = driver.switchTo().alert();
	
	
	String text = alt.getText();
	System.out.println(text);
	Thread.sleep(2000);
    alt.accept();
    //alt.sendKeys(text);
    
	
	
	}
}
