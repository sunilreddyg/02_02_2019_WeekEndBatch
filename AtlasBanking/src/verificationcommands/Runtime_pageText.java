package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_pageText 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*Note:--> Gettext method capture selected element 
		 * 			and it's child outterText
		 */
		
		
		//Capture Page visible Text..
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		WebElement Email_editbox=driver.findElement(By.id("identifierId"));
		Email_editbox.clear();
		Email_editbox.sendKeys("qadarshan@outlook.com");
		Thread.sleep(5000);
		
		//Identify page
		WebElement page=driver.findElement(By.tagName("body"));
		String page_visible_text=page.getText();
		System.out.println(page_visible_text);
		//Note:--> Gettext capture visible text on webpage
		
		String Exp_text="Couldn't find your Google Account";
		if(page_visible_text.contains(Exp_text))
			System.out.println("Expected invalid domain error msg visible at webpage");
		else
			System.out.println("testfail Errormsg not visible at webpage");
		
		
		String Exp_text2="If you've signed in to Google products like YouTube, try again with that email";
		if(page_visible_text.contains(Exp_text2))
			System.out.println("Expected text visible at webpage");
		else
			System.out.println("expected text not visible at webpage");
	}

}
