package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTestingExample {

	public static void main(String[] args) {
		XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheet;
		XSSFRow Row;
		XSSFCell Cell;
		
		File excelFile = new File("C:\\Users\\dell\\eclipse-workspace\\automationbatch\\TestData\\TestDataFile.xlsx");
		FileInputStream inputStream = null;
		
		try {
			inputStream = new FileInputStream(excelFile);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
			try {
				ExcelWBook = new XSSFWorkbook(inputStream);
			} catch (IOException e1) {				
				e1.printStackTrace();
			}
			
		ExcelWSheet=  ExcelWBook.getSheetAt(0);
		
		int ttlRows = ExcelWSheet.getLastRowNum()+1;
		
		int ttlCells = ExcelWSheet.getRow(0).getLastCellNum();
		
		for(int currentRow = 0; currentRow<ttlRows; currentRow++) {
			
			for(int currentCell = 0; currentRow<ttlCells; currentCell++) {
				System.out.print(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
				System.out.print("\t");
			}
			System.out.println();
		}
		
		try {
			ExcelWBook.close();		
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
