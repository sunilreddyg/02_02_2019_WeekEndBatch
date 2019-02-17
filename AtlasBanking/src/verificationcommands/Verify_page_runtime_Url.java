package verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_page_runtime_Url 
{

	public static void main(String[] args) 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Get Runtime url at current browser window
		String Runtime_url=driver.getCurrentUrl();
		
		//String Expected url
		String exp_url="https://www.seleniumhq.org/";
		
		//Writing decision statement to continue script on correct title presented
		if(Runtime_url.contains(exp_url))
		{
			System.out.println("expected url presented");
		}
		else
		{
			System.out.println("wrong url presented");
		}
		
		
		
		
		

	}

}
