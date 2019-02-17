package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Make_myTrip_ScrollWindow
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	
		
		//click Return date
		driver.findElement(By.id("hp-widget__return")).click();
		Thread.sleep(3000);
		
		//scroll window using javascript
	   ((JavascriptExecutor)driver)
	   .executeScript("window.scroll(300,100)");
	   Thread.sleep(5000);
	   
		//Wait and Select Next month button
		new WebDriverWait(driver, 100)
		.until(ExpectedConditions.visibilityOfElementLocated
		(By.xpath("(//span[@class='ui-icon ui-icon-circle-triangle-e'])[2]"))).click();
	  
	    
	}

}
