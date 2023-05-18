package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_printAll_Data_in_Column 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/sample5.html");
		
		for(int i=1;i<=4;i++)
		{
			
			if(i==1)
			{
				String text = driver.findElement(By.xpath("//tr["+i+"]/th[3]")).getText();
				System.out.println(text);
			}
			else
			{
				String text = driver.findElement(By.xpath("//tr["+i+"]/td[3]")).getText();
				System.out.println(text);
			}
		}
		
		
	}
}
