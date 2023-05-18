package Pom_DDF_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement Profilename;
	@FindBy(xpath="//a[text()=' Logout']") private WebElement logout;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyKiteHomePageProfilename()
	{
		String ActProfileName = Profilename.getText();
		return ActProfileName;
	}
	
	public void LogoutKite()
	{
		Profilename.click();
		logout.click();
	}
}
