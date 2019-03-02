package datadriven_ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_CellData {

	public static void main(String[] args) throws IOException 
	{
		
		//target file location
		String filepath="C:\\Users\\mindq\\git\\02_02_2019_WeekEndBatch\\AtlasBanking\\src\\datadriven_ApachePOI\\";
		//using file inputstream target workbook location
		FileInputStream fi=new FileInputStream(filepath+"InputData.xlsx");
		System.out.println("file located");
				
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		//Get Sheet acces using above book referal
		XSSFSheet sht=book.getSheet("Sheet1");
		
		
		//Write data into existing row and existing cell
		sht.getRow(1).getCell(2).setCellValue("Newpwd123");
		
		//Write date into existing row and New cell
		sht.getRow(1).createCell(6).setCellValue("Testpass");

		//Write Data into new row and new cell
		sht.createRow(2).createCell(0).setCellValue("http://facebook.com");
		
		
		//Create output workbook
		book.write(new FileOutputStream(filepath+"output.xlsx"));
		book.close();   //save dataOutput>xl
		
	}

}
