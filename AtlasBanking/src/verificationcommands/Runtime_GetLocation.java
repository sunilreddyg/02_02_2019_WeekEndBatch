package verificationcommands;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_GetLocation 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		
		
		//Identif multicity tab
		WebElement Multicity_tab=driver.findElement(By.xpath("//label[text()='multi-city']"));
		
		//Get Element Location
		Point obj_point=Multicity_tab.getLocation();
		
		//using objet-point get elemnet x and y coorindates
		int obj_x=obj_point.getX();
		System.out.println("Object x coordinates are => "+obj_x);
		
		int obj_y=obj_point.getY();
		System.out.println("Object y coordinates are => "+obj_y);

		
		/*
		 * Note:--> For hidden elements getlocation method return
		 * 			 zero coordinates.
		 */
		
		
		//Verify element visibility using x and y coordinates
		if(obj_x > 0)
			System.out.println("Element visible at webpage");
		else
			System.out.println("Element not visible at webpage");
	}

}
