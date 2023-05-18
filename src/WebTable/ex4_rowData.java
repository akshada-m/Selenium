package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_rowData 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver =new  ChromeDriver();
	
	driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/sample5.html");
	
	//for loop for cols
	for(int i=1;i<=3;i++)
	{
		String text = driver.findElement(By.xpath("//tr[2]/td["+i+"]")).getText();
		System.out.print(text+" ");
	}
	
	}
}
