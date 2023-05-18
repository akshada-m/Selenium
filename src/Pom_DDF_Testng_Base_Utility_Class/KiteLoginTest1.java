package Pom_DDF_Testng_Base_Utility_Class;

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
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

public class KiteLoginTest1 extends BaseClass
{
	int TCID;
//	WebDriver driver;
//	public void initialise_Browser()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
//		driver =new ChromeDriver();
//		driver.get("https://kite.zerodha.com/");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	}
	
	KiteLogin1Page p1;
	 KiteLogin2Page p2;
	 KiteHomePage home;
	
	
		
	@BeforeClass
		public void OpenBrowser() throws EncryptedDocumentException, IOException
		{
			 initialise_Browser();
			 p1=new KiteLogin1Page(driver);
			 p2=new KiteLogin2Page(driver);
			 home=new KiteHomePage(driver);
			
		}
		
		@BeforeMethod
		public void login() throws InterruptedException, EncryptedDocumentException, IOException
		{
			p1.inpKiteLogin1PageUsername(UtilityClass.GetDataFromPC("UN"));
			p1.inpKiteLogin1PagePassword(UtilityClass.GetDataFromPC("PWD"));
			p1.clickKiteLogin1PageLoginbtn();
			Thread.sleep(5000);
			p2.inpKiteLogin2PagePin(UtilityClass.GetDataFromPC("PIN"));
			p2.ClickKiteLogin2PageContinuebtn();
			
		}
		
		@Test
		public void VerifyPN() throws EncryptedDocumentException, IOException
		{
			TCID=100;
			String expId = UtilityClass.getTD(0,3);
			String actId = home.verifyKiteHomePageProfilename();
			Assert.assertEquals(actId, expId,"Failed:id dont match with actual :");
		}
		
		@AfterMethod
		public void Logout(ITestResult result) throws IOException
		{
			if(result.getStatus()==ITestResult.FAILURE)
			{
				UtilityClass.CaptureScreenshot(driver,TCID);
			}
		home.clickPN();
		home.ClickLogout();
		}
		
		
		@AfterClass
		public void CloseBrowser()
		{
			driver.close();
		}
	
}

		
