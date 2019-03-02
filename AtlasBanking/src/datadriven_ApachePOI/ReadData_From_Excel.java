package datadriven_ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_From_Excel {

	public static void main(String[] args) throws IOException
	{
		
		//Target File location
		String filepath="C:\\Users\\mindq\\git\\02_02_2019_WeekEndBatch\\AtlasBanking\\src\\datadriven_ApachePOI\\";
		FileInputStream fi=new FileInputStream(filepath+"InputData.xlsx");
		System.out.println("file located");
		
		//Access workbook
		XSSFWorkbook book= new XSSFWorkbook(fi);
		
		//Using book help access sheet
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Using above sheet target row
		XSSFRow row=sht.getRow(1);
		
		//Using Row target cell
		XSSFCell cell=row.getCell(0);
		
		//Read value from cell w.r.t available data.
		String url=cell.getStringCellValue();
		System.out.println(url);
		
		
		//Get Customer ID value from excel
		String CustomerID=row.getCell(1).getStringCellValue();
		System.out.println(CustomerID);
		
		//Get Mobile number from Excel [Convert Numeric cell to String cell manully by adding single code in excel]
		String MobileNum=row.getCell(3).getStringCellValue();
		System.out.println(MobileNum);
		
		//Get Alternet mobile
		Double Mobile=row.getCell(5).getNumericCellValue();
		System.out.println("Mobile number in double format is => "+Mobile.doubleValue());
		System.out.println("Mobile number is int format is => "+Mobile.longValue());
		
		
		//Convert Mobile number from Numeric format to string format
		String Alternate_Mobile=NumberToTextConverter.toText(Mobile);
		System.out.println("Mobile number in String format "+Alternate_Mobile);
		
		
		
		
		
		
		
		
		
	}

}
