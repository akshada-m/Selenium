package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex4_RowSize_inSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\USER\\Documents\\Study Akshada\\excelSheet\\Book1.xlsx");
		
		int rwindx = WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum();
		int rwcount=rwindx+1;
		System.out.println(rwcount);
		
	}
}
