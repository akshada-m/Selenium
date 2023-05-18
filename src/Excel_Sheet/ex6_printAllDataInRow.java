package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex6_printAllDataInRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Book1.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
	    int colind = sh.getRow(1).getLastCellNum()-1;
	    
	    //for loop for column
	    for(int i=0;i<=colind;i++)
	    {
	   String value = sh.getRow(5).getCell(i).getStringCellValue();	
	   System.out.print(value+" ");
	    }
	    
		
	}
}
