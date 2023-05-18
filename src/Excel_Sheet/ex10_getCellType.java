package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex10_getCellType 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file=new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Book1.xlsx");	
	 Cell cellinfo = WorkbookFactory.create(file).getSheet("Sheet5").getRow(0).getCell(0);
	 CellType typeOfCell = cellinfo.getCellType();
     System.out.println(typeOfCell);
     if(typeOfCell==CellType.STRING) 
 	{
 		String value = cellinfo.getStringCellValue();
 		System.out.print(value+" ");
 	}
 	else if(typeOfCell==CellType.NUMERIC)
 	{
 		double value = cellinfo.getNumericCellValue();
 		System.out.print(value+" ");
 	}
 	else if(typeOfCell==CellType.BOOLEAN)
 	{
 		boolean value = cellinfo.getBooleanCellValue();
 		System.out.print(value+" ");
 	}
	
	}
}
