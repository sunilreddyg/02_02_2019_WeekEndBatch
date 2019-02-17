package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editbox 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();     
		driver.get("https://cleartrip.com");
		driver.manage().window().maximize();
		
		
		//click roundtrip radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		//Type cityname at From_editbox
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("hyd");
		Thread.sleep(5000);  //to load bording cities
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		//Type cityname at TO-Editbox
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("del");
		Thread.sleep(5000);  //to load destination cities
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		//select date from datepicker
		driver.findElement(By.linkText("22")).click();
		Thread.sleep(4000);
		
		//Type Date in editox using [dateformat]
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Sun, 23 Jun, 2019");
		
		//Select dropdown 
		new Select(driver.findElement(By.id("Adults")))
		.selectByVisibleText("4");
		
		//click flight search button
		driver.findElement(By.xpath("//input[@value='Search flights']")).click();
	}

}
