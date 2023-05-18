package framework_testNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pom_with_DDF_testng 
{
	WebDriver driver;
	KiteLogin1Page page1;
	KiteLogin2Page page2;
	KiteHomePage home;
	Sheet sh ;
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Framework.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		page1=new KiteLogin1Page(driver);
		page2=new KiteLogin2Page(driver) ;
		home=new KiteHomePage(driver);
		
	}
	
	@BeforeMethod
	public void Login()
	{
		page1.inpKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		page1.inpKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		page1.clickKiteLogin1PageLoginbtn();
		page2.inpKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		page2.ClickKiteLogin2PageContinuebtn();
	}
	
	@Test
	public void VerifyProfileName()
	{
	String actId = home.verifyKiteHomePageProfilename();
	String expId = sh.getRow(0).getCell(3).getStringCellValue();
	Assert.assertEquals(actId, expId,"failed: both id are diff: ");
	}
	@AfterMethod
	public void Logout()
	{
		home.LogoutKite();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	

}
