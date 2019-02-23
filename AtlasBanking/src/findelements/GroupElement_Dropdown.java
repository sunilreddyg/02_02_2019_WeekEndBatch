package findelements;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupElement_Dropdown
{

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		//Identify dropdown
		WebElement State_dropdown=driver.findElement(By.id("customState"));
		
		//Identify list of option tags
		List<WebElement> DropdownOpions=State_dropdown.findElements(By.tagName("option"));
	
		//Get Option size
		int OptionCount=DropdownOpions.size();
		System.out.println("Option count is => "+OptionCount);
		
		//Iterate for number of options
		for (int i = 0; i < OptionCount; i++) 
		{
			//Target each option using index number
			WebElement EachState_option=DropdownOpions.get(i);
			//capture Name of State
			String StateName=EachState_option.getText();
			
			//Click each state
			EachState_option.click();
			Thread.sleep(5000);
			
			//identify City Dropdown
			WebElement CityDropdown=driver.findElement(By.id("customCity"));
			String Cities=CityDropdown.getText();
			//System.out.println("=>"+StateName+"\n"+"\t"+Cities);
			
			//maintain expected cities list into array
			String Exp_cities[]={"South Andaman","Guntur","Tawang"};
			for (int j = 0; j < Exp_cities.length; j++) 
			{
				String Exp_city=Exp_cities[j];
				if(Cities.contains(Exp_city))
					System.out.println(StateName+"  =>"+"expected city available in this state");
				else
					System.out.println(StateName+"  =>"+"expected city not available in this state");
			}
			
			
		}
		
		
		
		
	}

}
