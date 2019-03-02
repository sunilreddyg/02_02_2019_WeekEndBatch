package datadriven_ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_Using_Conditions {

	public static void main(String[] args) throws IOException {
		
		
		//target file location
		String filepath="C:\\Users\\mindq\\git\\02_02_2019_WeekEndBatch\\AtlasBanking\\src\\datadriven_ApachePOI\\";
		//using file inputstream target workbook location
		FileInputStream fi=new FileInputStream(filepath+"InputData.xlsx");
		System.out.println("file located");
		
		//Access Existing workbook using fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook accessed");
		
		//using above book target sheet
		XSSFSheet sht=book.getSheet("Sheet4");
		
		//Get Row Count of first and lastrow
		int Frnum=sht.getFirstRowNum();  //return count numer of cells data available at excel
		int Lrnum=sht.getLastRowNum();   //return count number of rows data available at excel
		
		//Iterate for expected ranges
		for (int i = 5; i <= Lrnum; i++) 
		{
			
			String Exe_status=sht.getRow(i).getCell(2).getStringCellValue();
			if(Exe_status.equalsIgnoreCase("y"))
			{
				
				//Target Each Dynamic row and static cell data
				String username=sht.getRow(i).getCell(0).getStringCellValue();
				String password=sht.getRow(i).getCell(1).getStringCellValue();
				
				System.out.println(username+"  "+password);
				
				//Get Scenario Status
				String Stype=sht.getRow(i).getCell(3).getStringCellValue();
				
				if(Stype.equals("p"))
				{
					System.out.println("positive output captured");
				}
				else if(Stype.equals("n"))
				{
					System.out.println("Negative output captured");
				}
				else if(Stype.equals("text"))
				{
					System.out.println("text output captured");
				}
				else if(Stype.equals("alert"))
				{
					System.out.println("alert handled");
				}
				
				
			}
			
	
		}

	}

}
