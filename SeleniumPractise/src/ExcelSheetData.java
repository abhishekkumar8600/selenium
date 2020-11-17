import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\selenium jars\\DataDrivenTesting.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int rowcount =sheet.getLastRowNum();
		
		int cellcount=sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowcount;i++)
		{
		 XSSFRow crow=sheet.getRow(i);	
		 
		 for(int j=0;j<cellcount;j++)
		 {
			String ccell=crow.getCell(j).toString(); 
			System.out.println(ccell);
		 }
		 System.out.println();
		}
		
		

	}

}
