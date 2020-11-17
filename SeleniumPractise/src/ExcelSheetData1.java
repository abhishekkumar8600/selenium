import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetData1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\selenium jars\\DataDrivenTesting1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		int sheets=workbook.getNumberOfSheets();
		
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData"))
			{
				XSSFSheet csheet=workbook.getSheetAt(i);
				 
				Iterator<Row> rows=csheet.iterator();
				Row r1=rows.next();
				Iterator<Cell> c1=r1.cellIterator();
				
			
				while(c1.hasNext())
				{
					Cell c11=c1.next();
					if(c11.getStringCellValue().equalsIgnoreCase("Data1"))
					{
						System.out.println(c11);
					}
				}
				
			}
			
		}
		
		
		
		
		

	}

}
