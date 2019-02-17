package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser_With_WebDriver_Interface 
{

	public static void main(String[] args)
	{
		
		/*
		 * WebDriver Interface class manipulate all
		 * browser instanes..
		 */
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //launch browser
		driver.get("http://facebook.com");   //Load webpage
		driver.manage().window().maximize();   //maximize window [optional]
		
		//IDentify email editbox and enter text init
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");
		
		//Identify password editox and enter text into
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Hello12345");
		
		//IDentify button and perform click
		driver.findElement(By.id("loginbutton")).click();
	}

}
