package verificationcommands;


import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Current_SystemDate_At_Application {

	public static void main(String[] args) 
	{
		
		/*
		 * Scenario:--> verify System date match with departure date
		 * 
		 * 			Given http://makemytrip.com
		 * 			then verify Deparute date match with system date.
		 */
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		//Capture Data from Departure editbox
		WebElement Departure_editbox=driver.findElement(By.id("hp-widget__depart"));
		//Get Inputvalue from Editbox [typed or autogenarated]
		String Ddate=Departure_editbox.getAttribute("value");
		System.out.println(Ddate);
		
		
		//Create object for system date
		Date d=new Date();
		//Create simple date format
		SimpleDateFormat df=new SimpleDateFormat("dd MMM, EEE");
		//using date formatter convert system date
		String Sdate=df.format(d);
		
		//Verify Departure date and system date
		if(Sdate.equals(Ddate))
			System.out.println("date match found");
		else
			System.out.println("date found mismatch");
	}

}
