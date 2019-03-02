package framework_testng.Suite_Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Get_Parameters_From_Suite 
{
	public WebDriver driver;
	
	@Test(priority=0)
	@Parameters("browser")
	public void launch_browser(String browsername)
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			Reporter.log("chrome browser launched");
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			Reporter.log("firefox browser launched");
		}
	}
	
	@Test(priority=1)
	@Parameters("appurl")
	public void loadWebpage(String url)
	{
		driver.get(url);
		Reporter.log("Webpage load successfull");
	}
	
	
	@Test(priority=2)
	@Parameters({"username","password"})
	public void User_login(String uid,String pwd)
	{
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uid);
		Reporter.log("Email enter successfull");
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(pwd);
	}
	
	
	
	

}
