package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Click_InsideCell 
{

	public static void main(String[] args) throws Exception 
	{
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
			
			//Get Dynamic row text
			String RowText=DynamicRow.getText();
			
			if(RowText.contains("MARUTI"))
			{
				flag=true;
				
				//using dynamic row find list of cells in each row
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				//Get specific cell address
				WebElement News_Cell=cells.get(7);
				//Under News cell Find link
				News_Cell.findElement(By.tagName("a")).click();
				
				break; //stop iteration
			}
			
				
		}//for


		if(flag==true)
		{
			Thread.sleep(5000);
			//Identify Newstable
			WebElement NewsTable=driver.findElement(By.xpath("//div[@id='tinydata']/table"));
			String NewsText=NewsTable.getText();
			System.out.println(NewsText);

		}
		
		System.out.println("record available status is => "+flag);
		
	}

}
