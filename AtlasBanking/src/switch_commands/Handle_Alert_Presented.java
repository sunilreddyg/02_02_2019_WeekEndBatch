package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Handle_Alert_Presented 
{

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
				
				
		//Identify search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@type='submit']"));
		Search_btn.click();
		Thread.sleep(5000);
		
		
		if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
		{
			//switch to alert window
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert
			String alerttext=alert.getText();
			System.out.println(alerttext);
			
			//Close Alert  [we can use Dismiss or accept]
			alert.accept();
			
		}
		else
			System.out.println("Alert not presented");
		
		
		
		

	}

}
