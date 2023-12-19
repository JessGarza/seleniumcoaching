package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static Object[][] readExcel(String filePath, String sheetName) throws IOException {
	    FileInputStream inputStream = new FileInputStream(new File(filePath));
	    Workbook workbook = new XSSFWorkbook(inputStream);
	    Sheet sheet = workbook.getSheet(sheetName);
	    int rowCount = sheet.getLastRowNum();
	    int columnCount = sheet.getRow(0).getLastCellNum();
	    Object[][] data = new Object[rowCount][columnCount];
	    for (int i = 1; i <= rowCount; i++) {
	      Row row = sheet.getRow(i);
	      for (int j = 0; j < columnCount; j++) {
	        data[i - 1][j] = row.getCell(j).toString();
	      }
	    }
	    workbook.close();
	    inputStream.close();
	    return data;
	  }
	}
	
	

