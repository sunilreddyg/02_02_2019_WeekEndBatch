package framework_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Invocation_Count 
{
 
	public WebDriver driver;
	public String url="http://facebook.com";
	

	  int i=0;
	  @Test(invocationCount=13)
	  public void test1() 
	  {
		  WebElement Month_Dropdown=driver.findElement(By.id("month"));
		  new Select(Month_Dropdown).selectByIndex(i);
		  
		 i=i+1;
	  }
  
  
  
		@BeforeClass
		public void launch_browser()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
	
	
	
}
