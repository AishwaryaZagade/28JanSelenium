package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example6_getAllDataInACol 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	 {
	  FileInputStream file=new FileInputStream("C:\\Html program\\Selenium Excel data.xlsx");
	  
	  Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
	  int lastRowIndex = sh.getLastRowNum();
	  
	  for(int i=0; i<=lastRowIndex; i++)
	  {
		String value = sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println(value);
	  }

}
}
