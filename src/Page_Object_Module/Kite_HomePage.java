package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage
{ 	
	//declare and find 
    @FindBy(xpath="//span[@class='user-id']") WebElement ProfileName;
    
    //initialise -constructor
    Kite_HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    //usage-method
    public String verifyProfile()
    {
    
    	String actProfile = ProfileName.getText();
    	return actProfile;
    	
    }
    
    
}
