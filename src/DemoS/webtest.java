package DemoS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtest
{
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
    driver.manage().window().maximize();
    driver.get("https://www.cowin.gov.in/");
    driver.findElement(By.xpath("//a[text()=' Dashboard ']")).click();
    
    String value = driver.findElement(By.xpath("//h3[text()=' Vaccinations Today ']/following::span[1]")).getText();
System.out.println(value);
driver.close();


}
}
