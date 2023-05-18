package DemoS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Book1.xlsx");
		
		Workbook f = WorkbookFactory.create(file);
		
		Sheet sh = f.getSheet("Sheet2");
		
		Row rw = sh.getRow(2);
		
		Cell cl = rw.getCell(1);
		
		String value = cl.getStringCellValue();
		System.out.println(value);
		
//		String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(2).getCell(1).getStringCellValue();
//		System.out.println(value);
	}
}
