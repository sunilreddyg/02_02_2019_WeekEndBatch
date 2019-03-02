package datadriven_ApachePOI;

import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_testData_From_multiple_Rows_And_Cells {

	public static void main(String[] args) throws IOException, Exception 
	{
		//target file location
		String filepath="C:\\Users\\mindq\\git\\02_02_2019_WeekEndBatch\\AtlasBanking\\src\\datadriven_ApachePOI\\";
		//using file inputstream target workbook location
		FileInputStream fi=new FileInputStream(filepath+"InputData.xlsx");
		System.out.println("file located");
		
		//Access Existing workbook using fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook accessed");
		
		//using above book target sheet
		XSSFSheet sht=book.getSheet("Sheet3");
		
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		
		//Get Row Count of first and lastrow
		int Frnum=sht.getFirstRowNum();  //return count numer of cells data available at excel
		int Lrnum=sht.getLastRowNum();   //return count number of rows data available at excel
		
		//Iterate for expected ranges
		for (int i = 5; i < Lrnum; i++) 
		{
			
			//Target Each Dynamic row and static cell data
			String username=sht.getRow(i).getCell(0).getStringCellValue();
			String password=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(username+"  "+password);
			
			//Read static Row and Cell Data
			String url=sht.getRow(0).getCell(1).getStringCellValue();
			String uid_locator=sht.getRow(1).getCell(1).getStringCellValue();
			String pwd_locator=sht.getRow(2).getCell(1).getStringCellValue();
			String Signin_btn_locator=sht.getRow(3).getCell(1).getStringCellValue();
			
			
			//Precondition
			driver.get(url);
			
			//Enter username
			driver.findElement(By.xpath(uid_locator)).clear();
			driver.findElement(By.xpath(uid_locator)).sendKeys(username);
			
			//Enter password
			driver.findElement(By.xpath(pwd_locator)).clear();
			driver.findElement(By.xpath(pwd_locator)).sendKeys(password);
			
			//click Signin button
			driver.findElement(By.xpath(Signin_btn_locator)).click();
			Thread.sleep(3000);
		}
				

	}

}
