package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
//pom class2
{   //declare variable for each element on which you have to perform action with private access specif
     @FindBy(xpath="//input[@id='pin']") private WebElement pin;
     @FindBy(xpath="//button[text()='Continue ']") private WebElement continueBtn;
     
   //initialise in constructor with public access specifier
    public KiteLogin2Page(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
    
    //enter pin
    public void enterPin()
    {
    	pin.sendKeys("959594");
    }
    //click on continue 
    public void clickOnContinue()
    {
    	continueBtn.click();
    }



}


