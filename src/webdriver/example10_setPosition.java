package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example10_setPosition 
{
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
Thread.sleep(2000);

driver.get("https://www.facebook.com/");
Thread.sleep(1000);
 
Point p=new Point(500, 100);
driver.manage().window().setPosition(p);
Thread.sleep(2000);

driver.close();
}
}
