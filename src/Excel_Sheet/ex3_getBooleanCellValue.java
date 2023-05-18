package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3_getBooleanCellValue 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Book1.xlsx");
		
		boolean value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(value);
	}
}
