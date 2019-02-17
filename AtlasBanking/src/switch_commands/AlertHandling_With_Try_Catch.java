package switch_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling_With_Try_Catch {

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
		
		
		try {
			
			//switch to alert window
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert
			String alerttext=alert.getText();
			System.out.println(alerttext);
			
			//Close Alert  [we can use Dismiss or accept]
			alert.accept();
			
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
			
		} catch (UnhandledAlertException e) {
			e.printStackTrace();
		}
		
		System.out.println("try catch block allow run without interuption");

	}

}
