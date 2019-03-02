package datadriven_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	public static String filepath="C:\\Users\\mindq\\git\\02_02_2019_WeekEndBatch\\AtlasBanking\\src\\datadriven_ApachePOI\\";
	public static FileInputStream fi;
	public static XSSFWorkbook book;
	public static XSSFSheet sht;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	/*
	 * Methodname:--> Connect to any excel and sheet.
	 * Author:-->
	 * CreatedOn:-->
	 * CreatedBy:-->
	 * Parametersused:-->
	 * lastupdated Date:--->
	 */
	public static void Get_Excel_connection(String filename,String sheetname)
	{
		try {
			
			fi=new FileInputStream(filepath+filename);
			book=new XSSFWorkbook(fi);
			//target sheet using above book
			sht=book.getSheet(sheetname);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

	/*
	 * Methodname:--> get Cell Data using row and column number.
	 * Author:-->
	 * CreatedOn:-->
	 * CreatedBy:-->
	 * Parametersused:-->
	 * lastupdated Date:--->
	 */
	public static String getCellData(int row_num, int cell_num)
	{
		//Target Row and Cell
		row=sht.getRow(row_num);
		//Using global row target cell
		cell=row.getCell(cell_num);
		
		String input=null;
		if(cell.getCellType()==cell.CELL_TYPE_STRING)
		{
			input=cell.getStringCellValue();
		}
		else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
		{
			Double val=cell.getNumericCellValue();
			input=NumberToTextConverter.toText(val);
		}
		
		return input;
		
	}
	
	
	/*
	 * Methodname:--> Write celldata
	 * Author:-->
	 * CreatedOn:-->
	 * CreatedBy:-->
	 * Parametersused:-->
	 * lastupdated Date:--->
	 */
	public static void Write_cellData(int row_num, int Cell_num, String result)
	{
		
		sht.getRow(row_num).createCell(Cell_num).setCellValue(result);
		
	}
	
	
	/*
	 * Methodname:--> Create output file
	 * Author:-->
	 * CreatedOn:-->
	 * CreatedBy:-->
	 * Parametersused:-->
	 * lastupdated Date:--->
	 */
	public static void createExcel_output(String filename)
	{
		try {
			book.write(new FileOutputStream(filepath+filename));
			book.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
