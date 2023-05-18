package DemoS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_autosuggestions
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
	
	Thread.sleep(3000);
	
	List<WebElement> allsuggestions = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
	
	for(WebElement suggestion:allsuggestions)
	{
		String value = suggestion.getText();
		System.out.println(value);
	}
	
	
	
	
}
}
