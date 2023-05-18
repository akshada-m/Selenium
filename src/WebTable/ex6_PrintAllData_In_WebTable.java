package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_PrintAllData_In_WebTable
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/sample5.html");
		
		//outer for loop for row
		for(int i=1;i<=4;i++)
		{
			//inner for loop for column
			for(int j=1;j<=3;j++)
			{
				String text;
				if(i==1)
				{
					 text = driver.findElement(By.xpath("//tr["+i+"]/th["+j+"]")).getText();
				}
				else
				{
					text=driver.findElement(By.xpath("//tr["+i+"]/td["+j+"]")).getText();
				}
				System.out.print(text+" ");
			}
			System.out.println();
		}
		
		
	}
}
