package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Selection {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		
		/*
		 * Testcase:--> Verify trip type selection roundtrip radio button.
		 * precondition:--> roundtrip should be selected
		 * Expected:--> Should visible return date container.
		 */
		
		//Select roundtrip radio button
		WebElement Rountrip=driver.findElement(By.id("RoundTrip"));
		Rountrip.click();
		
		if(Rountrip.isSelected())
		{
			System.out.println("Roundtrip Selected");
			WebElement Returndate=driver.findElement(By.id("ReturnDate"));
			//verify element visibility
			if(Returndate.isDisplayed())
				System.out.println("As expected return date visible on roundtrip selection");
			else
				System.out.println("Testfail Roundtrip hidden on oneway selection");
			
		}
		else
			System.out.println("precondition failed roundtrip was not selected");
				

	}

}
