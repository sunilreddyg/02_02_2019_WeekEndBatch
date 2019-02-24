package method_parameters;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;

import waitcommand.Waitfor_text_VisibleAt_Element_Location;

public class Run_MouseHover extends Repository
{

	@Test
	public void test() 
	{
		
		launch_browser("chrome");
		LoadApp("http://hdfcbank.com");
		set_timeout(30);
		
        By products=By.xpath("//a[@href='/personal/products']");
		By cards=By.linkText("Cards");
		By creditCards=By.linkText("Credit Cards");
		
		MouseHover(products);
		
		wait_for_Element_visible(cards);
		MouseHover(cards);
		
		wait_for_Element_visible(creditCards);
		Click_element(creditCards);
		
	}

}
