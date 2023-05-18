package handling_Of_Dynamic_Element;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_of_4th_chappal
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/mens-footwear/slippers-flip-flops/pr?sid=osp%2Ccil%2Ce1r&p%5B%5D=facets.brand%255B%255D%3DNIKE&hpid=rYjcVC_K03v3D3-bQYT6n6p7_Hsxr70nj65vMAAFKlc=&fm=neon%2Fmerchandising&iid=M_95e6ed7f-2038-49bf-b24f-0586e87e89e1_14.QRNUH9YICS6E&ssid=01gwgtfypc0000001637660516209&otracker=hp_omu_Men%2527s%2BFootwear%2B_5_12.dealCard.OMU_QRNUH9YICS6E_6&otracker1=hp_omu_WHITELISTED_neon%2Fmerchandising_Men%2527s%2BFootwear%2B_NA_dealCard_cc_5_NA_view-all_6&cid=QRNUH9YICS6E");
		WebElement chappal = driver.findElement(By.xpath("(//div[@class='_1xHGtK _373qXS'])[4]"));
	
	     chappal.click();
	
	     
	     HashMap< String ,Integer> mp=new HashMap<String, Integer>();
	     Set<String> sk = mp.keySet();
	     for(String k:sk)
	     {
	    	 System.out.println(k);
	     }
	}
}
