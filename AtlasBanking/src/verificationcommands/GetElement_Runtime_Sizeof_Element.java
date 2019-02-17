package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElement_Runtime_Sizeof_Element
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		
		
		//Identif multicity tab
		WebElement Multicity_tab=driver.findElement(By.xpath("//label[text()='multi-city']"));
		
		//Get Element Size in dimension
		Dimension obj_dim=Multicity_tab.getSize();
	
		//Get element height
		int obj_height=obj_dim.getHeight();
		System.out.println("Objet height is => "+obj_height);

		//Get Element widhth o
		int obj_width=obj_dim.getWidth();
		System.out.println("Objet width is => "+obj_width);
		
		//Verify Element visibility using height and width
		if(obj_height > 0)
			System.out.println("Element visible");
		else
			System.out.println("Element not visible");

	}

}
