package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex11_PrintAllTypeOfDataInRow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream file=new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Book1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
	
	int colindex = sh.getRow(1).getLastCellNum()-1;
	
	for(int i=0;i<=colindex;i++)
	{
	Cell cellinfo = sh.getRow(1).getCell(i);
	CellType typeOfCell = cellinfo.getCellType();
	
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
}
