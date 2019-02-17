package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Frame 
{

	public static void main(String[] args) 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		//Switch to frame suing Locator
		WebElement ModalFrame=driver.findElement(By.id("modal_window"));
		driver.switchTo().frame(ModalFrame);
		
		//Idetnify editbox under frame
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Darshan@gmail.com");
		
		//Identify editbox under frame
		driver.findElement(By.xpath("//input[@title='Trip ID']")).clear();
		driver.findElement(By.xpath("//input[@title='Trip ID']")).sendKeys("12457854");

		
		//Bring controls to mainpage
		driver.switchTo().defaultContent();
		
		
		//Identify location at webpage
		driver.findElement(By.linkText("Flights")).click();
	}

}
