package week5.day2.classroom;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public String[][] getXLValue(String fileName) throws IOException  {
		XSSFWorkbook wbook=new XSSFWorkbook("./data/"+fileName+".xlsx");
XSSFSheet sheetAt = wbook.getSheetAt(0);
short colCount = sheetAt.getRow(0).getLastCellNum();
int rowCount = sheetAt.getLastRowNum();
String[][] data=new String[rowCount][colCount];
for (int i = 1; i<=rowCount; i++) {
	XSSFRow row = sheetAt.getRow(i);
	for (int j = 0; j < colCount; j++) {
		XSSFCell cell = row.getCell(j);
		String value = cell.getStringCellValue();
		data[i-1][j]=value;
		//System.out.println(value);
	} 
	wbook.close();
}
return data;
	}


}

