package practise_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomepage 
{
    @FindBy(xpath="//span[@class='user-id']") private WebElement profilename;
    
    public kiteHomepage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    //verify profile name
    public void verifyProfile()
    {
    	String expProname = "DV1510";
    	String ActProname = profilename.getText();
    	if(ActProname.equals(expProname))
    	{
    		System.out.println("pass");
    	}
    	else 
    	{
			System.out.println("fail");
		}
    }
    
    
    
    
}
