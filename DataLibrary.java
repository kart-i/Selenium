package week5.assignments;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {

	public static String[][] fetchExcelData(String excelFileName) throws IOException {
		
		XSSFWorkbook excelWorkbook = new XSSFWorkbook("./Data/"+excelFileName+".xlsx");
		XSSFSheet sheet = excelWorkbook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		XSSFRow row = sheet.getRow(0);
		int columnCount = row.getLastCellNum();
		System.out.println("row - "+rowCount);
		System.out.println("column-"+columnCount);
		
		String[][] data = new String[rowCount][columnCount];
		
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<columnCount;j++) {
				
				String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue);
				data[i-1][j]= cellValue;
			}
					
		}
		excelWorkbook.close();
		return data;
		
		
	}

}
