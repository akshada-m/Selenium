package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1page
//pom class1
{
	//declare variable for each element on which you have to perform action with private access specif
	@FindBy(xpath="//input[@id='userid']") private WebElement userId;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[text()='Login ']")private WebElement loginBtn;
	
	//initialise in constructor with public access specifier
	public KiteLogin1page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//usage
	//enter UserName
	public void enterUserId()
	{
		userId.sendKeys("DV1510");
	}
	
	//enter password
	 public void enterPassword()
	 {
		 password.sendKeys("Pass@123");
	 }
	 
	 //click on login btn
	  
	 public void ClickloginBtn()
	 {
		 loginBtn.click();
	 }
	


}
