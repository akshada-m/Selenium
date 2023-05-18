package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example4 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream file=new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Book1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
	int colInd = sh.getRow(3).getLastCellNum()-1;
	
	for(int i=0;i<=colInd;i++)
	{
		String value = sh.getRow(3).getCell(i).getStringCellValue();
		System.out.print(value+" ");
	}
	
	}
	
	
	
}
