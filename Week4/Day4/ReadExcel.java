package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
       //To Open the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./Data/CreateLead.xlsx");		
		
		//To enter into the worksheet
		  XSSFSheet sheet = wb.getSheet("Sheet1");
		
		
	   //To count the number of rows   -Excludes the header
		int rowCount = sheet.getLastRowNum();
		System.out.println("Without row 1: "+rowCount);
		
		//Count the number of rows- Including the header
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("With row 1: "+physicalNumberOfRows);
		
		
		//To count the number of columns
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count: "+columnCount);
		
		//To retrieve a particular value
		String rowColumnData = sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println("Data1 is : "+rowColumnData);
		
		
		//To retrieve the entire value
		for (int i = 1; i <=rowCount ; i++) {
	    XSSFRow row = sheet.getRow(i);
			
	    for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				System.out.println("Data are: "+allData);
			}
		}
		
	}

}
