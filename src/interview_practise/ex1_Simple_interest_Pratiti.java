package interview_practise;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex1_Simple_interest_Pratiti 
{
@Test
public void calculate_interest() throws EncryptedDocumentException, IOException, InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/USER/Documents/Study%20Akshada/html%20coding/ic.html");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	FileInputStream file =new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\interestsheet.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("interest");
	 String p = sh.getRow(0).getCell(0).getStringCellValue();
	 String r = sh.getRow(0).getCell(1).getStringCellValue();
	 String t = sh.getRow(0).getCell(2).getStringCellValue();
	
	
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(p);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(r);
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(t);	
	driver.findElement(By.xpath("//a[@type='button']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("3600");
	Thread.sleep(3000);
	String actinterest = driver.findElement(By.xpath("(//input[@type='text'])[2]")).getText();
		
//			
			int pint = Integer.parseInt(p);
			int rint = Integer.parseInt(r);
			int tint=Integer.parseInt(t);
			 int exp = (pint*rint*tint)/100;
			 String expinterest = Integer.toString(exp);
			 
		
	//String expinterest = sh.getRow(0).getCell(3).getStringCellValue();
	
	Assert.assertEquals(actinterest,expinterest,"failed");
	
}

}
