package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_print_data_inParticular_index 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/sample5.html");
	
	//to print data in datacol
	WebElement coldata = driver.findElement(By.xpath("//tr[4]/td[2]"));
	
	System.out.println(coldata.getText());
	
	//to print data in headercol
	WebElement headerdata = driver.findElement(By.xpath("//tr[1]/th[2]"));
	System.out.println(headerdata.getText());
	
	}
}
