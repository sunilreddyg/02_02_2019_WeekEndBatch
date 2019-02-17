package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Selection_Using_Sendkeys 
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
		
		//Select dropdown option using keyboad charactes
		driver.findElement(By.id("day")).sendKeys("24");
		
		
		//Select dropdown option using keyboard shortcut
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		/*
		 * Note:--> Sendkeys command accept character sequences
		 * 			and keyboard shortcuts. For Keyboard shortcuts
		 * 			webdriver never send exceptions.
		 */
		
		
	}

}
