package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5_getAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	 {
	  FileInputStream file=new FileInputStream("C:\\Html program\\Selenium Excel data.xlsx");
	  
	  Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
	  
	  int lastCellIndex = sh.getRow(0).getLastCellNum()-1;
	  
//	               4<=3
	  for(int i=0; i<=lastCellIndex; i++)
	  {
		  String value = sh.getRow(0).getCell(i).getStringCellValue();
		  System.out.print(value+" ");
	  }
//	  abc1 abc2 abc3 xyz4
	  
	 }	 
}
