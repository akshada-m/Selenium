package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_xpath_ByContains_withAttribute
{
    public static void main(String[] args) 
    {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		//enter username
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("sdbvue");
		
	}
}