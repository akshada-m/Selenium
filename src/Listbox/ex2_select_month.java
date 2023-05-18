package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex2_select_month
{

public static void main (String []args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://en-gb.facebook.com/");
Thread.sleep(3000);
//click on create new acc button
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
Thread.sleep(3000);

//step 1:find listbox element and store it in variable
 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

//step 2:create object of select class pass that variable in constructor of select class
 Select s1=new Select(month);

//step 3:
	
 s1.selectByVisibleText("Jul");
}
}