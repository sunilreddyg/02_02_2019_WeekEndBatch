package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Between_Frame 
{

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		
		//identify frame using frame name
		driver.switchTo().frame("packageListFrame");
		
		//click link under packagelistframe
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		//Get control back to mainpage
		driver.switchTo().defaultContent();
		
		//Switch to Diff frame
		driver.switchTo().frame(1);
		
		//click link under frame1
		driver.findElement(By.linkText("Alert")).click();
		
		
		//get controls back to mainpage
		driver.switchTo().defaultContent();
		
		//identify frame and switch to it
		driver.navigate().to("https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/Alert.html");
		Thread.sleep(5000);
		
		
		//click link under frame
		driver.findElement(By.linkText("Instance Methods")).click();
		Thread.sleep(3000);
		
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		//Get back controls to mainpage
		driver.switchTo().defaultContent();
		
		
		
		
		
		

	}

}
