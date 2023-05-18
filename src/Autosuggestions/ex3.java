package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("oneplus");
	
	Thread.sleep(3000);
	
	List<WebElement> Alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	System.out.println(Alloptions.size());
	
	
	for(WebElement option:Alloptions)
	{
		System.out.println(option.getText());
	}

}
}
