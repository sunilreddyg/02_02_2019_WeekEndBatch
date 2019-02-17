package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_And_PartialLinktext {

	public static void main(String[] args) 
	{
		
		/*
		 * WebDriver Interface class manipulate all
		 * browser instanes..
		 */
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //launch browser
		driver.get("http://cleartrip.com");   //Load webpage
		driver.manage().window().maximize();   //maximize window [optional]
		
		//Find Link at webpage
		driver.findElement(By.linkText("About Us")).click();
		
		//Find link at webpage using linkname
		driver.findElement(By.linkText("Jobs")).click();
		
		//Find link at webpage using linkname
		driver.findElement(By.linkText("Job Openings")).click();

		
		//Find link at webpage
		driver.findElement(By.partialLinkText("Executive – Travel Facilitator (Implant)")).click();
	}

}
