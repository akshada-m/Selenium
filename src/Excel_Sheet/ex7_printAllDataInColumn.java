package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex7_printAllDataInColumn 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file= new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int rwind = sh.getLastRowNum();
		//for loop for row
		
		for(int i=0;i<=rwind;i++)
		{
			String value = sh.getRow(i).getCell(3).getStringCellValue();
			System.out.println(value);
		}
		
		
	}
}
