package findelements;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_ReadData_From_SpecificRow_And_Cell {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();

		
		//identify table
		WebElement table=driver.findElement(By.xpath
				("//div[@id='pnl_Bse']/table"));

		//Find list of rows available at webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//Target Specific row
		WebElement SelectedRow=rows.get(7);
		
		//using selected row find group of elements
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		//Get specific cell address
		WebElement StockName_Cell=cells.get(0);
		WebElement HighPrice_Cell=cells.get(3);
		
		System.out.println(StockName_Cell.getText()
				+"    "+HighPrice_Cell.getText());
		
	}

}
