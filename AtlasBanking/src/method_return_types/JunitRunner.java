package method_return_types;

import org.junit.Assert;
import org.junit.Test;

public class JunitRunner extends Repository
{
	String url="http://seleniumhq.org";
	@Test
	public void test() 
	{
		launch_browser("chrome");
		LoadApp(url);
		set_timeout(30);
		
		String Exp_title="Selenium - Web Browser Automation";
		if(IsTitle_presented(Exp_title))
			System.out.println("title presented");
		else
			System.out.println("title mismatch");
		
		String Exp_url="https://www.seleniumhq.org/";
		if(IsUrl_Presented(Exp_url))
			System.out.println("Url Match");
		else
			System.out.println("Url mismatch");
		
		
		//Verify title presentd with assertions
		Assert.assertTrue(IsTitle_presented(Exp_title));
		System.out.println("Testpass expected title presented");
		
		
		//Verify alert presented at webpage
		if(isAlert_presented())
			driver.switchTo().alert().accept();
		else
			System.out.println("alert not presented");
		
		
		
	}

}
