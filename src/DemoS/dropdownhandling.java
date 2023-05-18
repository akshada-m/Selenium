package DemoS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdownhandling 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//click to close button 
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
//		//find dropdownelement
//		WebElement logindropdwn = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
//		
//		Actions act= new Actions(driver);
//		
//		act.moveToElement(logindropdwn).perform();
//		
//		//click on option 
//		WebElement fpz = driver.findElement(By.xpath("//div[text()='Flipkart Plus Zone']"));
//		
//		act.click(fpz).perform();
//		
			
	}
}
