package practise_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitepage2 
{
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement continuebtn;
	
	public kitepage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//enter pin
	public void enterPin()
	{
		pin.sendKeys("959594");
	}
	
	//click on continuebtn
	public void clickOnContinue()
	{
		continuebtn.click();
	}
	
	
	
}
