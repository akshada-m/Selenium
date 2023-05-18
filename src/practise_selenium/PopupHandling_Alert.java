package practise_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling_Alert 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
     //click to dispay alert box after5sec		
	   
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	    Thread.sleep(6000);;
	    Alert al = driver.switchTo().alert();
	    System.out.println( al.getText());
	    al.accept();
		
	}
}
