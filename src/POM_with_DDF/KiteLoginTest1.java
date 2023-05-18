package POM_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	FileInputStream file=new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Framework.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//login1 page
	KiteLogin1Page page=new KiteLogin1Page(driver);
	
	//String un = sh.getRow(0).getCell(0).getStringCellValue();
	page.inpKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
	
	//String pwd = sh.getRow(0).getCell(1).getStringCellValue();
	page.inpKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
	
	
	page.clickKiteLogin1PageLoginbtn();
	
	//login2page
	KiteLogin2Page page2=new KiteLogin2Page(driver);
	
	//String pin = sh.getRow(0).getCell(2).getStringCellValue();
	page2.inpKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
	
	page2.ClickKiteLogin2PageContinuebtn();
	Thread.sleep(2000);
	
	//homepage
	KiteHomePage page3=new KiteHomePage(driver);
	
	//String expvalue = sh.getRow(0).getCell(3).getStringCellValue();
	page3.verifyKiteHomePageProfilename(sh.getRow(0).getCell(3).getStringCellValue());
	
	}
}
