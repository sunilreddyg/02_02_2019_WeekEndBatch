package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_NextMonthDates_DatePicker 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//identify departure date
		WebElement Departure_date=driver.findElement(By.id("dpt_date"));
		Departure_date.click();
		Thread.sleep(2000);
		
		
		for (int i = 0; i < 3; i++) 
		{
			
			//Identfiy Current month Window 
			WebElement CurrentMonth_window;
			CurrentMonth_window=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			
			//Find number of clickable links
			List<WebElement> Active_links;
			Active_links=CurrentMonth_window.findElements(By.tagName("a"));
			
			
			//iterate for number of links
			for (int j = 0; j < Active_links.size(); j++) 
			{
				//get each active date at current month window
				Active_links.get(j).click();
				Thread.sleep(1000);
				
				//Using deparute  date referal click it
				Departure_date.click();
				
				//To Avoid staleelementreference-exception restore current month window location and list of links
				CurrentMonth_window=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
				Active_links=CurrentMonth_window.findElements(By.tagName("a"));
			}
			
			
			
			//Identify Nextmonth button
			WebElement Next_month_btn=driver.findElement(By.xpath("//a[@title='Next month']"));
			Next_month_btn.click();
			Thread.sleep(3000);
		}
		
		
		
		
		
		

	}

}
