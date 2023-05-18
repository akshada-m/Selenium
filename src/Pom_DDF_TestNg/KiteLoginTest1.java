package Pom_DDF_TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest1 
{
	WebDriver driver;
	KiteLogin1Page p1;
	 KiteLogin2Page p2;
	 KiteHomePage home;
	 Sheet sh;
	
		
	@BeforeClass
		public void OpenBrowser() throws EncryptedDocumentException, IOException
		{
		FileInputStream file= new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Framework.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 p1=new KiteLogin1Page(driver);
			 p2=new KiteLogin2Page(driver);
			 home=new KiteHomePage(driver);
			
		}
		
		@BeforeMethod
		public void login() throws InterruptedException
		{
			p1.inpKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
			p1.inpKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
			p1.clickKiteLogin1PageLoginbtn();
			Thread.sleep(5000);
			p2.inpKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
			p2.ClickKiteLogin2PageContinuebtn();
			
		}
		
		@Test
		public void VerifyPN()
		{
			String expId = sh.getRow(0).getCell(3).getStringCellValue();
			String actId = home.verifyKiteHomePageProfilename();
			Assert.assertEquals(actId, expId,"Failed:id dont match with actual :");
		}
		
		@AfterMethod
		public void Logout()
		{
			home.LogoutKite();
		}
		
		
		@AfterClass
		public void CloseBrowser()
		{
			driver.close();
		}
	
}

		
