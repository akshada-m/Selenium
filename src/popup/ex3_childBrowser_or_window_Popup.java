package popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_childBrowser_or_window_Popup
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
     WebDriver driver=new ChromeDriver();
     
     driver.get("https://skpatro.github.io/demo/links/");
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
     //click on new tab
     driver.findElement(By.xpath("//input[@name='NewTab']")).click();
     
     //click on training tab on child window
     //switch to child window
    Set<String> allids = driver.getWindowHandles();
    ArrayList<String> al=new ArrayList<String>(allids);
    String ChildWindowId = al.get(1);//child window id
    
     driver.switchTo().window(ChildWindowId);//String id
     driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
     
     //click on new Window tab on main page
     //switch to main page window
     String mainPageid = al.get(0);
     driver.switchTo().window(mainPageid);
     driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
     
     //switch to new child window and  maximize
     Set<String> allids1 = driver.getWindowHandles();
     ArrayList<String>al1= new ArrayList<String>(allids1);
     String newchildid = al1.get(2);
     driver.switchTo().window(newchildid);
     driver.manage().window().maximize();
     
	
	}
}
