package DemoS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ex1
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
	
	Thread.sleep(3000);
	
	String expOption="redmi 9";
	List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e']/li)[5]"));
	
	for(WebElement option:alloptions)
	{
		String actualOption = option.getText();
		if (expOption.equals(actualOption))
		{
			option.click();
			WebDriverWait wt =new WebDriverWait(driver, 10);
		}
	}
	
}
}
