package pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_Pagefactory_objects 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//using pagefactory class identify @findby elements
		Facebook_Homepage fbpage=PageFactory.initElements
				(driver, Facebook_Homepage.class);
		
		fbpage.Login_email.clear();
		fbpage.Login_email.sendKeys(fbpage.Input_username);
		
		fbpage.Login_password.clear();
		fbpage.Login_password.sendKeys(fbpage.Input_password);
		
		
		fbpage.SignUp_Firstname_EB.clear();
		fbpage.SignUp_Firstname_EB.sendKeys(fbpage.Input_firstname);
		
		fbpage.SignUp_Surname_EB.clear();
		fbpage.SignUp_Surname_EB.sendKeys(fbpage.Input_surname);
		
		
		fbpage.Signup_Dropdowns.get(1).findElements
		(By.tagName("option")).get(3).click();
		
		
		
	}

}
