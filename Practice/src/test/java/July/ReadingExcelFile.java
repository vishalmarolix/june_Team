package July;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws Throwable {
    File file= new File("./target/Financial Sample.xlsx");
    FileInputStream str= new FileInputStream(file);
    XSSFWorkbook workbook= new XSSFWorkbook(str);
   XSSFSheet sheet= workbook.getSheetAt(0);
   int rows=sheet.getPhysicalNumberOfRows();
   int cells=sheet.getRow(0).getLastCellNum();
   for(int i=0;i<rows;i++) {
	   
	   for(int j=0;j<cells;j++) {
		   DataFormatter df= new DataFormatter();
		   
		   System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
		   
	   }
   }
    str.close();
    workbook.close();
	}

}
