package dataReader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	
	@Test
	public String[][] readExcel(String sheetName) throws IOException {
		FileInputStream io = new FileInputStream("./Data/"+sheetName+".xls");
		HSSFWorkbook wbook = new HSSFWorkbook(io);
		HSSFSheet sheet = wbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		// Getting column count through header.
		HSSFRow headerRow = sheet.getRow(0);
		//Getting last column of the header to find total column in the sheet.
		int lastCellNum = headerRow.getLastCellNum();
		System.out.println(lastCellNum);
				
		String[][] data = new String[rowCount][lastCellNum];
		
		//Rows consider header hence it starts from 1
		
		for(int i=1;i<=rowCount;i++) {
			
			HSSFRow row = sheet.getRow(i);
			
			//Column has no header hence 0 given here
			for(int j=0;j< lastCellNum;j++)
				
			{
				HSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
				data [i-1][j]= value;
				
			}

	}
		wbook.close();
		return data; 
		
	}
}
