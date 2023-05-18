package handling_Of_Dynamic_Element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_getViews
{
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//search song
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("hum sath sath hai songs");
		
		//click on search icon
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(6000);
		
		String views = driver.findElement(By.xpath("((//div[@class='style-scope ytd-video-renderer'])[1]//span)[4]")).getText();
		System.out.println(views);
	}
}
