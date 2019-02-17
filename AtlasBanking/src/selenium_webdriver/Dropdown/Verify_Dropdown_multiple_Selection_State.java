package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_multiple_Selection_State {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();     
		driver.get("https://www.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		//Return multiple selection state true/false
		boolean flag=new Select(driver.findElement(By.id("open_account")))
		.isMultiple();
		System.out.println("Dropdown multiple selection status is => "+flag);

		
		//using javascript convert single option dropdown to multiple option dropdown
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('open_account').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		//Return multiple selection state true/false
		boolean flag1=new Select(driver.findElement(By.id("open_account")))
		.isMultiple();
		System.out.println("Dropdown multiple selection status is => "+flag1);

		
		
		
		//Idetify Dropdown with select class
		Select OpenAccount=new Select(driver.findElement(By.id("open_account")));
		
		//Select multiple options.
		if(flag1==true)
		{
			//This block of code execute only when dropdown selection return multiple
			OpenAccount.deselectAll();
			OpenAccount.selectByIndex(1);
			OpenAccount.selectByIndex(3);
			OpenAccount.selectByIndex(5);
		}
		else
			System.out.println("Dropdown is a not multiple selection type");
		
		
		
		
		
		
		
	}

}
