package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	
	static XSSFWorkbook wb;
    static XSSFSheet sheet;
    static FileInputStream fis;
    public static File src = new File("./Excel/TideNew.xlsx");
    
    public static String getStringData(int rowNum,int colNum) throws IOException {
  	  fis = new FileInputStream(src);
  	  wb = new XSSFWorkbook(fis);
  	  sheet= wb.getSheetAt(0);
  	  String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
  	  wb.close();
  	  return data;
  	
  	  
  	  
    }
    public static Double getNumericData(int rowNum,int colNum) throws IOException {
  	  fis = new FileInputStream(src);
  	  wb = new XSSFWorkbook(fis);
  	  sheet = wb.getSheetAt(0);
  	  Double data  = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
  	  return data;
    }
    

}
