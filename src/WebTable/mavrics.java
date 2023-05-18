package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mavrics
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	 List<WebElement> allrows = driver.findElements(By.xpath("//tr"));
	 String actc;
	 String expc = "Afganistan";
	 int rowsize = allrows.size();
	 System.out.println(rowsize);
	 boolean t = driver.findElement(By.xpath("(//tr[2]/td)[1]")).isEnabled();
	 System.out.println(t);
	 for(int i=1;i<197;i++)//for rows
	 {
		 actc = driver.findElement(By.xpath("//tr["+i+"]/td["+2+"]")).getText();
		 if(actc.equals("Afganistan"))
		 {
			 WebElement check = driver.findElement(By.xpath("//tr["+i+"]/td["+1+"]"));
			 check.click();
			 break;
		 }	
	}
	 }
	 
}
