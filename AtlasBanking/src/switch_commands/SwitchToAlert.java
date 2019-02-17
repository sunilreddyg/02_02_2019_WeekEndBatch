package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {

	public static void main(String[] args) throws Exception
	{
		
		/*
		 * Testcase:-->
		 * 			verify jobsearch functionality without selecting
		 * 			Course and Keyword.
		 *  Steps:-->
		 *  		Given -url is https://www.firstnaukri.com/
		 *  		Then click on Search button without Enter Course and Keyword
		 *  Expected:-->
		 *  		System should prompt with approprite error msg.
		 *  
		 */
		
		
		
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
		//Identify search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@type='submit']"));
		//Search_btn.click();
		Thread.sleep(5000);
		
		//switch to alert window
		Alert alert=driver.switchTo().alert();
		
		//Capture text on alert
		String alerttext=alert.getText();
		System.out.println(alerttext);
		
		//Close Alert  [we can use Dismiss or accept]
		alert.accept();
		
		
		/*
		 * Capture text on alert popup
		 * 	
		 * 		driver.swtitchTo().alert().gettext();
		 * 
		 * Accept alert window  [It close popup window]
		 * 
		 * 		driver.switchTo().alert().accept();
		 * 
		 * Dismiss alert window [It close popup window]
		 * 
		 * 		driver.switchTo().alert().dismiss();
		 * 
		 * Sendtext at alert window [Mostly at prompt window]
		 * 
		 * 		driver.switchTo().alert().Sendkeys("type characters");
		 */
		
		
		((JavascriptExecutor)driver)
		.executeScript("return prompt('Enter mobilenumber')");
		
		
		driver.switchTo().alert().sendKeys("90302448855");
		Thread.sleep(5000);
		
		
		//Accept alert window
		driver.switchTo().alert().accept();
		
		
		
		
		
	}

}
