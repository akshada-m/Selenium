package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_Print_Row_Size
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	
	driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/sample5.html");
	
	List<WebElement> allrow = driver.findElements(By.xpath("//tr"));
    System.out.println(	allrow.size());


	
	}
}
