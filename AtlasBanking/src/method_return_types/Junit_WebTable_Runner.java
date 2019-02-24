package method_return_types;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Junit_WebTable_Runner extends Repository
{
	String url="http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx";
	@Test
	public void test() 
	{
		launch_browser("chrome");
		LoadApp(url);
		set_timeout(30);
		
		String table_xpath="//div[@id='pnl_Bse']/table";
		WebElement StockCell=Get_Table_CellAddress(table_xpath, 7, 0);
		String Stockname=StockCell.getText();
		System.out.println(Stockname);
		
		//StockCell.findElement(By.tagName("a")).click();
		
		
		String Recordname="ONGC";
		Webtable_Dynamic_CellAdress(table_xpath, Recordname, 7).click();
		
		
		
		
		
		
		
		
		
	}

}
