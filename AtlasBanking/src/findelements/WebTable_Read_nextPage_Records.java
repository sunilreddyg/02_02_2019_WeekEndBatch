package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Read_nextPage_Records 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//click link to open table
		WebElement Nifty_link=driver.findElement(By.xpath("//a[@title='Nifty Weightage']"));
		Nifty_link.click();
		Thread.sleep(5000);
		
		//Target Nifty table
		WebElement table=driver.findElement(By.id("gridSource"));

		//Find number of rows
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		int count=1;
		//iterate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			
			//Target Each row
			WebElement DynamicRow=rows.get(i);
			//Get text of each dynamic row
			String Rowtext=DynamicRow.getText();
			System.out.println("=> "+Rowtext);
			
		
			if(count==20)
			{
				WebElement Next_btn=driver.findElement(By.xpath("//th[@class='table-page:next']"));
				Next_btn.click();
				count=0;
			}
			
			count=count+1;
			
		}
		
		
	}

}
