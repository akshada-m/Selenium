package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//get column count
		FileInputStream file=new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Book1.xlsx");
	    int colsize = WorkbookFactory.create(file).getSheet("Sheet3").getRow(1).getLastCellNum();
	    
	    System.out.println(colsize);
	    
	    
		
	}
}
