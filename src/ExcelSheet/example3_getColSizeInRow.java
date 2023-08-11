package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3_getColSizeInRow 
{
 public static void main(String[] args) throws EncryptedDocumentException, IOException 
 {
	FileInputStream file=new FileInputStream("C:\\\\Html program\\\\Selenium Excel data.xlsx");
	
	short colSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	
	System.out.println(colSize);
}
}
