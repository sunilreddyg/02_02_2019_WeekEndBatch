package variable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_And_LocatorClass_Referral 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();     
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Target Email location
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		
		//Target password location
		WebElement password_editbox=driver.findElement(By.id("pass"));
		password_editbox.clear();
		password_editbox.sendKeys("hello123456");
		
		
		By signin_btn_locator=By.id("loginbutton");
		WebElement signin_btn=driver.findElement(signin_btn_locator);
		signin_btn.click();
		
		
		

		

	}

}
