package Page_Object_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class simple_pom_without_pagefactoy 
{
	private WebElement UN;
	private WebElement Pwd;
	private WebElement Login;
	
	public simple_pom_without_pagefactoy(WebDriver driver)
	{
		UN=driver.findElement(By.xpath("//input[@id='userid']"));
		Pwd=driver.findElement(By.xpath("//input[@id='password']"));
		Login=driver.findElement(By.xpath("//button[text()='Login ']"));
	}
	
	public void enterUN()
	{
		UN.sendKeys("DV1510");
	}
	
	public void enterPwd()
	{
		Pwd.sendKeys("Pass@123");
	}
	public void ClickLogin()
	{
		Login.click();
	}
	
	
	
}
