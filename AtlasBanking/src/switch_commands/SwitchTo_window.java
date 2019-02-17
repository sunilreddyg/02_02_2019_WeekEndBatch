package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_window 
{
	public static void main(String args[]) throws Exception
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Get current window dynamic ID
		String mainwindowID=driver.getWindowHandle();
		System.out.println(mainwindowID);
		
		
		
		System.out.println("current window title before switch is => "+driver.getTitle());
		
		//click external link [External link open page at new window]
		driver.findElement(By.linkText("Instagram")).click();
		
		
		//Get All window Dynamic ID's
		Set<String> AllwindowIDS=driver.getWindowHandles();
		for (String EachWindowID : AllwindowIDS) 
		{
			driver.switchTo().window(EachWindowID);
		}
		
		System.out.println("current window title after switch is => "+driver.getTitle());
		
		
		Thread.sleep(5000);
		
		//Enter details at new window
		WebElement Email=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		Email.clear();
		Email.sendKeys("9030248855");
		
		
		//Close sub window
		driver.close();
		
		//Switch to mainwindow
		driver.switchTo().window(mainwindowID);
		System.out.println("Focus available at main window");
		

		
	}

}
