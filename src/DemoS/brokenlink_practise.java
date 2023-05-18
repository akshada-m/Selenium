package DemoS;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink_practise 
{
private static final String HttpURLConnection = null;

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
    driver.manage().window().maximize();
    driver.get("https://www.amazon.com/");
    
    List<WebElement> links = driver.findElements(By.tagName("a"));
    
    for(WebElement link:links)
    {
    	String url = link.getAttribute("href");
    	
    }
    driver.quit();
}

public static void verifybrokenlinks(String url)
{
	try
	{
		URL u=new URL(url);
		HttpURLConnection httpurlconn = (HttpURLConnection)u.openConnection();
		httpurlconn.connect();
		if(httpurlconn.getResponseCode()>=400)
		{
			System.out.println(url+"-->"+httpurlconn.getResponseMessage()+"broken link");
		}
		else
		{
			
		}
	}
	catch(Exception e)
	{
		
	}
	
	
}








}
