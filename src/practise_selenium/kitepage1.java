package practise_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitepage1
{
      	@FindBy(xpath="//input[@id='userid']") private WebElement un;
      	@FindBy(xpath="//input[@id='password']") private WebElement pwd;
      	@FindBy(xpath="//button[text()='Login ']") private WebElement loginbtn;
      	
      	//initialize
      	
      	public kitepage1(WebDriver driver)
      	{
      		PageFactory.initElements(driver,this);
      	}
      	
      	//usage
      	//enter un
      	public void enterUN()
      	{
      		un.sendKeys("DV1510");
      	}
      	
      	//enter password
      	public void enterPwd()
      	{
      		pwd.sendKeys("Pass@123");
      	}
      	//click on login
      	
      	public void clickOnLogin()
      	{
      		loginbtn.click();
      	}
      	
      	
}
