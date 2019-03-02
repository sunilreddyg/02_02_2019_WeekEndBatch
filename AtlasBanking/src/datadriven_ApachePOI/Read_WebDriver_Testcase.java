package datadriven_ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_WebDriver_Testcase 
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
		XSSFSheet sht=book.getSheet("Sheet2");
		
		//Using above sheet target row
		XSSFRow row=sht.getRow(1);
				
		//Get Data from sheet
		String url=row.getCell(1).getStringCellValue();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//get navigation button locator from excel
		String SignIn_btn_locator=row.getCell(2).getStringCellValue();
		driver.findElement(By.xpath(SignIn_btn_locator)).click();
		
		//Get Email locator and input data
		String Email_locator=row.getCell(3).getStringCellValue();
		String Email_input=row.getCell(4).getStringCellValue();
		driver.findElement(By.xpath(Email_locator)).clear();
		driver.findElement(By.xpath(Email_locator)).sendKeys(Email_input);
		
		
		
		
		
		
		
		

	}

}
