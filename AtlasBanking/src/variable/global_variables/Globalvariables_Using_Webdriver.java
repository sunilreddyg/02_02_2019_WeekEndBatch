package variable.global_variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Globalvariables_Using_Webdriver
{
	
	public WebDriver driver;  //Global variable initiation
	String url="http://facebook.com";
	String username;
	String password;
	By login_btn_locator=By.id("loginbutton");
	By password_locator=By.id("pass");
	By email_locator=By.id("email");
	
	public void browser_setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void user_login()
	{
		//Regular syntax without variable.
		WebElement email_editbox=driver.findElement(email_locator);
		email_editbox.clear();
		email_editbox.sendKeys(username);
		
		//Using webelement referal values
		WebElement password_editbox=driver.findElement(password_locator);
		password_editbox.clear();
		password_editbox.sendKeys(password);
		
		//using Locator class
		WebElement Login_btn=driver.findElement(login_btn_locator);
		Login_btn.click();
	
	}
	
	
	public void verify_element_visibility()
	{
		boolean flag=driver.findElement(email_locator).isSelected();
		System.out.println("email visible status is => "+flag);
	}
	

}
