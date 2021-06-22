package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataWriterByColumnNumber 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis  = new FileInputStream("C:\\Users\\DELL\\Desktop\\testdata2.xlsx");
		FileOutputStream fos = null ;
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
	
		XSSFFont font = wb.createFont();
		XSSFCellStyle style = wb.createCellStyle();
		
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(4);
		
		font.setFontName("Algerian");
		font.setFontHeight(14);
		font.setBold(true);
		
		style.setFont(font);
		cell.setCellStyle(style);
		
		cell.setCellValue("Failed");
		
		fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\testdata2.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();

	}

}
