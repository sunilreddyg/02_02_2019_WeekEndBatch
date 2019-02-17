package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		
		//Select dropdown option
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");
		Thread.sleep(4000);
		
		//Select city option
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");
		
		//Identify locality editbox and type locality name
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Srnagar");
		
		//Select radius in km
		new Select(driver.findElement(By.name("radius")))
		.selectByIndex(3);
		
		//Select checkbox
		driver.findElement(By.id("amenity_category_order_types49")).click();
		
		//click on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
