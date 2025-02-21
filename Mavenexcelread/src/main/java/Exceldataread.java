import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataread {
static FileInputStream i; //Data read 
static XSSFWorkbook wb;
static XSSFSheet sh;

 public static String readStringData(int row, int col) throws IOException {
	i = new FileInputStream("C:\\Users\\ANISH\\Desktop\\Java Excel Read 1.xlsx");
	wb = new XSSFWorkbook(i);
	sh = wb.getSheet("Sheet1");

	XSSFRow r = sh.getRow(row);

	XSSFCell c = r.getCell(col);

	return c.getStringCellValue();

	}
 
 public static String readIntegerData(int row, int col) throws IOException {
		i = new FileInputStream("C:\\Users\\ANISH\\Desktop\\Java Excel Read 1.xlsx");
		wb = new XSSFWorkbook(i);
		sh = wb.getSheet("Sheet1");
		XSSFRow r = sh.getRow(row);
		XSSFCell c = r.getCell(col);
		int val = (int) c.getNumericCellValue();//DEFAULT VALUE IS DOUBLE.TO CONVERT INT IS USED.
		return String.valueOf(val);

	}

}
