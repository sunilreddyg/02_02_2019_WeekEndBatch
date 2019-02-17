package verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_pageRuntime_title {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Capture current window title at runtime
		String Runtime_title=driver.getTitle();
		
		String expected_title="Selenium - Web Browser Automation";
		
		//Verifying Equal comparision between two Strings
		boolean flag=Runtime_title.equals(expected_title);
		System.out.println("Title presented status is => "+flag);
		
		//Writing decision statement to continue script on correct title presented
		if(flag==true)
		{
			System.out.println("Expected title presented");
		}
		else
		{
			System.out.println("wrong title presented");
		}
		
		
		
		
		
		
		
		

	}

}
