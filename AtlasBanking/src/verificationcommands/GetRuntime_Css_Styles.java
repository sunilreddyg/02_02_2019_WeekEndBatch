package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRuntime_Css_Styles 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		
		//Identif multicity tab
		WebElement Multicity_tab=driver.findElement(By.xpath("//label[text()='multi-city']"));
		Multicity_tab.click();
		
		
		//Get element color at runtime [Note--> selenium return color in RGBA format]
		String Runtime_Color=Multicity_tab.getCssValue("color");
		System.out.println(Runtime_Color);
		
		
		
		
		
		

	}

}
