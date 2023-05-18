package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example10 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file=new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Book1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
	int rowindex = sh.getLastRowNum();
	
	for(int i=0;i<=rowindex;i++) 
	{
		Cell cellinfo = sh.getRow(i).getCell(0);
		CellType typeOfCell = cellinfo.getCellType();
		
		if(typeOfCell==CellType.STRING)
		{
			String value = cellinfo.getStringCellValue();
			System.out.println(value);
		}
		else if(typeOfCell==CellType.NUMERIC)
		{
			double value = cellinfo.getNumericCellValue();
			System.out.println(value);
		}
		else if(typeOfCell==CellType.BOOLEAN)
		{
			boolean value = cellinfo.getBooleanCellValue();
			System.out.println(value);
		}
	}
	
	
	}
}
