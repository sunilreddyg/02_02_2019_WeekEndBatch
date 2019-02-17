package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript_Popup_wIndows {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//Create popup window
		 ((JavascriptExecutor)driver).executeScript("return alert('Tc001 Executed successfull')");
		 Thread.sleep(5000);
		 //Close alert window
		 driver.switchTo().alert().accept();
		 
		 
		//Create popup window
		 ((JavascriptExecutor)driver).executeScript("return alert('Tc002 Executed successfull')");
		 Thread.sleep(5000);
		 //Close alert window
		 driver.switchTo().alert().accept();
		 
		 
		 
		 
		 
	}

}
