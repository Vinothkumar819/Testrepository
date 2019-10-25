package readData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcelfile {

	public static void main(String[] args) throws Exception {
	 File f=new File("C:\\Users\\www\\Desktop\\new.xlsx");
	 FileInputStream fis=new FileInputStream(f);
	 Workbook wb=new XSSFWorkbook(fis);
	Sheet s= wb.getSheetAt(0);
	int rowcount= s.getLastRowNum()-s.getFirstRowNum();
	for(int i=0;i<rowcount+1;i++)
	{
		Row r=s.getRow(i);
		for(int j=0;j<r.getLastCellNum();j++)
		{
			System.out.print(r.getCell(j).getStringCellValue()+ " ");
		}
		System.out.println(" ");
		}
	}
		
		

	}


