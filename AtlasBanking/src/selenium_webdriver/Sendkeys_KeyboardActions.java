package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_KeyboardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		/*
		 * WebDriver Interface class manipulate all
		 * browser instanes..
		 */
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //launch browser
		driver.get("http://gmail.com");   //Load webpage
		driver.manage().window().maximize();   //maximize window [optional]
		
		
		/*
		 * In Webdriver syntax Sendkeys command allow
		 * 			"Keyboarshortcuts" and "character sequences"
		 * 
		 * 		Keyboard shortcuts:-->
		 * 					Sendkeys(Keys.tab)
		 * 		Characters sequecnes:-->
		 * 
		 * 					Sendkeys("abcdef--z")
		 */
		
		
		
		//Idetnify Email editbox and perform keyboard shortcuts
		driver.findElement(By.name("identifier")).clear();
		driver.findElement(By.name("identifier"))
		.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		
		Thread.sleep(5000);
		
		//Identify password editbox and perfrom keybaord action
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password"))
		.sendKeys("Hello12345",Keys.ENTER);
		
		
		

	}

}
