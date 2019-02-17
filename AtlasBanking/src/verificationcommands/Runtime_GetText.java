package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_GetText {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Testcase:--> Verify gmail email validation with invalid domain name
		 * Steps;-->
		 * 			Launch chromebrowser
		 * 			load Gmail homepage
		 * 			Enter invalid domain name 
		 * 			click Next button
		 * Expected:-->
		 * 			System should throw appropriate error msg.
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		//type email with invalid domain address
		WebElement Email_editbox=driver.findElement(By.id("identifierId"));
		Email_editbox.clear();
		Email_editbox.sendKeys("qadarshan@outlook.com",Keys.ENTER);
		Thread.sleep(5000);
		
		//Locate Error text
		WebElement Error_location=driver.findElement(By.xpath("//div[@class='GQ8Pzc']"));
		String Runtime_text=Error_location.getText();
		
		String Exp_text="Couldn't find your Google Account";
		
		//Verify expected text and runtime text equal comparision
		if(Exp_text.equalsIgnoreCase(Runtime_text))
		{
			System.out.println("As expected Error msg displayed on invalid domain name");
		}
		else
		{
			System.out.println("Testfail Error expected error msg not dispalyed");
		}
		
		
		
		String exp_info="If you've signed in to Google products like YouTube, try again with that email";
		//Locate aria of info text.
		WebElement InvalidDomain_info=driver.findElement(By.xpath("//div[@jsname='OZNMeb']"));
		//Get Text on location
		String Runtime_Info=InvalidDomain_info.getText();
		
		//Write condition to execute on expected text presented
		if(Runtime_Info.equalsIgnoreCase(exp_info))
			System.out.println("Expected info msg displyed on invalid domain");
		else
			System.out.println("Wrong info msg displayed on invalid domain");
		
		

	}

}
