package method_parameters;

import org.junit.Test;
import org.openqa.selenium.By;


public class Run_Repository_With_Parameters extends Repository
{

	@Test  //Invoke method to run without object creation
	public void test() throws InterruptedException 
	{
		//Methods from repository class
		launch_browser("chrome");
		LoadApp("http://facebook.com");
		set_timeout(30);
		
		//Enter text into editbox using xpath
		Enter_text("//input[@type='email']", "9030248855");
		Enter_text("//input[@name='pass']", "Newpwd1234");
		
		
		//Enter text into editbox using BY locator class
		Enter_text(By.cssSelector("#u_0_j"),"Ajay");
		
		
		//Selectdropdown
		Select_dropdown(By.id("month"), "May");
		
		
		//Select radio button
		Click_element(By.xpath("//input[@value='1']"));
		
		Thread.sleep(5000);
		driver.close();  //From Repository class
		
	}

}
