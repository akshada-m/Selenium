package Framework;

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

public class ex2_With_DDF1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Framework.xlsx");
	    Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Study Akshada\\webdriver and selenium tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");	
		
		
		
				//enter userid
		 		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
				
				//enter password
		 		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
				
				//click on login button
				driver.findElement(By.xpath("//button[text()='Login ']")).click();
				
				//enter pin
				driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(sh.getRow(0).getCell(2).getStringCellValue());
				
				//click on continue button
				driver.findElement(By.xpath("//button[text()='Continue ']")).click();
				
				//get userid after login 
				String ActUserid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
				String ExpUserid = sh.getRow(0).getCell(3).getStringCellValue();
				if(ActUserid.equals(ExpUserid))
				{
					System.out.println("pass");
				}
				else
				{
					System.out.println("fail");
				}
		
		
	}
}
