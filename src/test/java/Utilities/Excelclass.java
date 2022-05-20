package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelclass {

	public XSSFWorkbook wb;

	public Excelclass() throws IOException {
		File f = new File("");
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);

	}

	public String getStringData(int sheetIndex, int row, int column) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();

	}

	public String getstringData(int sheetName, int row, int column) {
		return wb.getSheetAt(sheetName).getRow(row).getCell(column).getStringCellValue();
	}

	public String getNumericData(int sheetName, int row, int column) {
		return wb.getSheetAt(sheetName).getRow(row).getCell(column).getStringCellValue();
	}

}
