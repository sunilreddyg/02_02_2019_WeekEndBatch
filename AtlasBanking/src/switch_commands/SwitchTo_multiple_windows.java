package switch_commands;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_multiple_windows 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Switch to main window
		String mainwindow=driver.getWindowHandle();
		
		System.out.println("main window Dynamic id => "+driver.getWindowHandle());
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//capture all window dynamic ID's
		Set<String> AllwindowIds=driver.getWindowHandles();
		//Apply foreach loop
		for (String EachWindowID : AllwindowIds) 
		{
			//Switch to every window 
			driver.switchTo().window(EachWindowID);
			//capture Every page title at runtime
			String Runtime_title=driver.getTitle();
			
			//Accept condition required window
			if(Runtime_title.contains("Seat Availability"))
			{
				break;
			}
		}
		
		
		System.out.println("Window focused At => "+driver.getTitle());

	}

}
