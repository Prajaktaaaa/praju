package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Util {
public static String readExcel(int rowNum,int colNum) throws EncryptedDocumentException, IOException
{
	FileInputStream file = new FileInputStream("C:\\Users\\admin29\\Desktop\\dummy\\FirstMavenProject\\TestData\\forFramework.xlsx");
      Sheet excelSheet = WorkbookFactory.create(file).getSheet("Sheet1");
	 return excelSheet.getRow(rowNum).getCell( colNum).getStringCellValue();
}
}
