package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example11_getAllDataInAColl 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	 {
	 FileInputStream file=new FileInputStream("C:\\Html program\\Selenium Excel data.xlsx");
	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
	 
	 int lastRowIndex = sh.getLastRowNum();
	 
	 for(int i=0; i<=lastRowIndex; i++)
	 {
		 Cell cellInfo = sh.getRow(i).getCell(0);
		 CellType s1 = cellInfo.getCellType();
		 
		 if(s1==CellType.STRING)
		 {
			 String value = cellInfo.getStringCellValue();
			 System.out.println(value);
		 }
		 else if(s1==CellType.NUMERIC)
		 {
			 double value = cellInfo.getNumericCellValue();
			 System.out.println(value);
		 }
		 else if(s1==CellType.BOOLEAN)
		 {
			 boolean value = cellInfo.getBooleanCellValue();
			 System.out.println(value);
		 }
	 }
}
}