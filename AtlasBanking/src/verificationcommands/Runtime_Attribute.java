package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Attribute 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Testcase:--> Verify Multicity Tab Selection during
		 * 			flight Search functionality.
		 * 
		 * 		Steps:-->
		 * 				launch chrome browser window
		 * 				load makemytrip homepage
		 * 				Select Multiciy tab selection
		 * 
		 * Expected:-->
		 * 			System should select multicity tab and display
		 * 			Add city button.
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		
		//Identif multicity tab
		WebElement Multicity_tab=driver.findElement(By.xpath("//label[text()='multi-city']"));
		Multicity_tab.click();
		
		//Verify Multicity tab selection
		
		//Get Runtime Property value using propertyname
		String Runtime_class=Multicity_tab.getAttribute("class");
		
		if(Runtime_class.contains("flight-trip-type"))
		{
			System.out.println("multicity tab selected");
			
			/*
			 * Testcase:--> Verify Addcity button visible on multicity tab selection
			 */
			//Identify Location of AddCity button
			WebElement Addcity_btn=driver.findElement(By.xpath("//button[@id='addModifyBtn']"));
			if(Addcity_btn.isDisplayed())
				System.out.println("Addcity button visible on multicity selection");
			else
				System.out.println("Addcity not visible on multicity selection");
			
		}
		else
		{
			System.out.println("Multicity tab not selected and add city button visibility not validated");
		}

	}

}
