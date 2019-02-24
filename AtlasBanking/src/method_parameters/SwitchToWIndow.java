package method_parameters;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToWIndow extends Repository
{

	@Test
	public void test() 
	{
		
		launch_browser("chrome");
		LoadApp("http://hdfcbank.com");
		set_timeout(30);
		
		
		//Click External link [page open at new window]
		Click_element(By.xpath("//a[@href='/htdocs/common/agri/index.html']"));
		new WebDriverWait(driver, 10).until
		(ExpectedConditions.numberOfWindowsToBe(2));
		
		switchto_window("Kisan Dhan Vikas e-Kendra");
		CaptureScreen("Vikas e-Kendra");
		
		//get back to mainpage
		switchto_window("Personal Banking Services");
		CaptureScreen("HDFC mainpage from Vikas E_kendra page");
		
		
		
	}

}
