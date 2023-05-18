package Pom_DDF_Testng_Base_Utility_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{
	
	public static String getTD(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Framework.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");	
		
		String value = sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		return value;
	}
	
	public static void CaptureScreenshot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\USER\\Documents\\Study Akshada\\Screenshots\\TCID"+TCID+".jpg");
		FileHandler.copy(src, dest);
		
	}
	
	public  static String GetDataFromPC(String key) throws IOException
	{
		Properties obj=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\Selenium\\abc.properties");
		obj.load(file);
		String value = obj.getProperty(key);
	    return value;
	
	}
}
