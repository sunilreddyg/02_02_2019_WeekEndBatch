package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicRow_Using_Referral_Record
{

	public static void main(String[] args)
	{
		//identify Required record from dynamic cell
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();

		
		//identify table
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));

		//Find list of rows available at webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//Get size of List
		int RowCount=rows.size();
		
		boolean flag=false;
		//Apply forloop to iterate expected range
		for (int i = 1; i < RowCount; i++)
		{
			//Target Each row
			WebElement DynamicRow=rows.get(i);
			
			//Get Each Row text
			String Rowtext=DynamicRow.getText();
			
			if(Rowtext.contains("TATSTE"))
			{
				flag=true;
				System.out.println("Record available at Row number is  --> "+i);
				
				//using dynamic row find list of cells in each row
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				//Get specific cell address
				WebElement StockName_Cell=cells.get(0);
				WebElement HighPrice_Cell=cells.get(3);
				
				System.out.println(StockName_Cell.getText()
						+"    "+HighPrice_Cell.getText());
			}
			
			
		}//for
		System.out.println("Record available status is => "+flag);

	}

}
