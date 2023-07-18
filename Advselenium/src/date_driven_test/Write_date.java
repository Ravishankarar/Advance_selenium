package date_driven_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_date {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Excelfile/Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		 Sheet sh = book.getSheet("Sheet1");
		
		  Row r = sh.getRow(5);
		 Cell c = r.getCell(3);
		 c.setCellValue("ravishankar");
		 FileOutputStream fos=new  FileOutputStream("./Excelfile/Book1.xlsx"); 
		 book.write(fos);
		  
	

	}

}
