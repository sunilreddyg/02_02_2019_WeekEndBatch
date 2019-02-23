package waitcommand;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Title {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Create object for Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		String Exp_title="Selenium - Web Browser Automation";
		wait.until(ExpectedConditions.titleIs(Exp_title));
		System.out.println("Title verifed");
		
		//Click Link Downloads
		WebElement Downloads=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
		Downloads.click();
		
		
		//Wait and verify expected title presented
		wait.until(ExpectedConditions.titleContains("Downloads"));
		System.out.println("title verified for downloads page");
		
		
		
		

	}

}
