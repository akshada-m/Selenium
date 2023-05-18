package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_colData 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		WebDriver driver =new  ChromeDriver();
		
		driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/sample5.html");
		
		//for loop for rows
		for(int i=1;i<=4;i++)
			{
			String text;
			if(i==1)
			{
				 text = driver.findElement(By.xpath("//tr["+i+"]/th[3]")).getText();
			}
			else
			{
				text = driver.findElement(By.xpath("//tr["+i+"]/td[3]")).getText();
			}
			System.out.println(text);
		}
	}
}
