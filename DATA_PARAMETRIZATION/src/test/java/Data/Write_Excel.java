package Data;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Write_Excel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		
		Workbook wb = new HSSFWorkbook();
		
		try  (OutputStream fileOut = new FileOutputStream("D:\\JANBASK\\WEEKEND_WORKSPACE_BATCH1\\DATA_PARAMETRIZATION\\src\\main\\java\\TestData\\workbook.xls")) {
			Sheet sheet1 = wb.createSheet("new sheet");
			Sheet sheet2 = wb.createSheet("second sheet");
			
			Row row = sheet1.createRow(0);
			// Create a cell and put a value in it.
			Cell cell = row.createCell(0);
			cell.setCellValue(1);
			row.createCell(1).setCellValue(1.2);
			
			row.createCell(2).setCellValue(true);
		    wb.write(fileOut);
		}
		
		
		
		
		
	}

}
