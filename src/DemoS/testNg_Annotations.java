package DemoS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNg_Annotations
{
	WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void LoginToApp()
	{
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("akshadamulik450@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akshu@7215");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}
	
	@Test
	public void VerifyProfileName()
	{
		String ExpPro="Akshada";
		String Actpro = driver.findElement(By.xpath("//div[text()='Akshada']")).getText();
		Assert.assertEquals(Actpro,ExpPro,"failed -profile name is diff");
	}
	
	@Test
	public void VerifyCartButtonisEnabled()
	{
		boolean ActResult = driver.findElement(By.xpath("//span[text()='Cart']")).isEnabled();
		Assert.assertTrue(ActResult);
	}
	
	@AfterMethod
	public void LogoutFromApp() throws InterruptedException
	{
		WebElement dropdown = driver.findElement(By.xpath("//div[text()='Akshada']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(dropdown).perform();;
		
		WebElement logout = driver.findElement(By.xpath("//div[text()='Logout']"));
		
		act.moveToElement(logout).perform();
		
		act.click().perform();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
}
