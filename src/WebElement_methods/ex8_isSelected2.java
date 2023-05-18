package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_isSelected2 
{
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://en-gb.facebook.com");

	//click on create new account
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3000);

	WebElement fbtn=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	boolean result =fbtn.isSelected();
	if(result==true)
	{
	System.out.println("button is already selected");
	}
	else
	{
	System.out.println("button is not selected");
	fbtn.click();
	}
	boolean result1=fbtn.isSelected();
	if(result1==true)
	{
	System.out.println("Button is selected");
	}
	else
	{
	System.out.println("Button is not selected");
	}

	}


}