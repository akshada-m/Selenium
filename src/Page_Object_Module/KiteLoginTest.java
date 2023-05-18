package Page_Object_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    driver.get("https://kite.zerodha.com/");
    
    KiteLogin1page page1=new KiteLogin1page(driver) ;
    page1.enterUserId();
    page1.enterPassword();
    page1.ClickloginBtn();
    
    KiteLogin2Page page2=new KiteLogin2Page(driver);
    page2.enterPin();
    page2.clickOnContinue();
    
    Kite_HomePage page3=new Kite_HomePage(driver);
    page3.verifyProfile();
    
    
    
    
    
    
    
	}
}
