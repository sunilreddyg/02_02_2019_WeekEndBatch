package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_VisibilityAt_WebPage {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		
		
		/*
		 * Testcase:--> Verify trip type selection oneway radio button.
		 * Expected:--> Should hide return date container
		 */
		
		
		//select oneway radio button
		WebElement Onway_trip=driver.findElement(By.id("OneWay"));
		Onway_trip.click();
		
		//Locate return date editbox
		WebElement Returndate=driver.findElement(By.id("ReturnDate"));
		//Get Element visible status
		boolean flag=Returndate.isDisplayed();
		
		
		//Write condition to continue execution on visible
		if(!Returndate.isDisplayed())  //!--NOT
			System.out.println("As expected Element hidden on onway selection");
		
		else
			System.out.println("testfail return date visible on oneway trip selection");
		
		
		
		//Timeout to execute next testcase
		Thread.sleep(10000);
		
		
		
		/*
		 * Testcase:--> Verify trip type selection roundtrip radio button.
		 * Expected:--> Should visible return date container.
		 */
		
		//Select roundtrip radio button
		WebElement Rountrip=driver.findElement(By.id("RoundTrip"));
		Rountrip.click();
		
		
		//verify element visibility
		if(Returndate.isDisplayed())
			System.out.println("As expected return date visible on roundtrip selection");
		else
			System.out.println("Testfail Roundtrip hidden on oneway selection");
		
		
	}

}
