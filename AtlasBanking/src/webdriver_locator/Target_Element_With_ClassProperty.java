package webdriver_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target_Element_With_ClassProperty 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.paytm.com");
		driver.manage().window().maximize();
		
		
		
		//Identify location with class property
		driver.findElement(By.className("iconMenu")).click();
		Thread.sleep(4000);
		
		
		int count=driver.findElements(By.className("a4dK")).size();
		System.out.println(count);
		
		
		driver.findElements(By.className("a4dK")).get(9).click();
		
		

	}

}
