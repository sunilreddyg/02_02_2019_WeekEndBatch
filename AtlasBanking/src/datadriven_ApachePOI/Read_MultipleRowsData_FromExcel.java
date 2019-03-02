package datadriven_ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_MultipleRowsData_FromExcel 
{

	public static void main(String[] args) throws IOException 
	{
		//Target File location
		String filepath="C:\\Users\\mindq\\git\\02_02_2019_WeekEndBatch\\AtlasBanking\\src\\datadriven_ApachePOI\\";
		FileInputStream fi=new FileInputStream(filepath+"InputData.xlsx");
		System.out.println("file located");
				
		//Access workbook
		XSSFWorkbook book= new XSSFWorkbook(fi);
				
		//Using book help access sheet
		XSSFSheet sht=book.getSheet("Sheet3");
		
		//Get Count of Number of row data available with in sheet
		int FrowNum=sht.getFirstRowNum();
		int LrowNum=sht.getLastRowNum();
		
		//Iterate using for loop
		for (int i = 5; i <= LrowNum; i++)
		{
			 //Get Each dynamic row in excel with help of integer increment
			XSSFRow DynamicRow=sht.getRow(i);
			
			//Get static Cell Data
			String username=DynamicRow.getCell(0).getStringCellValue();
			String password=DynamicRow.getCell(1).getStringCellValue();
			
			System.out.println(username+"   "+password);
			
		}
		
		
		int FcellNum=sht.getRow(1).getFirstCellNum();
		int LcellNum=sht.getRow(1).getLastCellNum();
		System.out.println("FirstCell numberis "+FcellNum);
		System.out.println("Lastcell numberis "+LcellNum);

	}

}
