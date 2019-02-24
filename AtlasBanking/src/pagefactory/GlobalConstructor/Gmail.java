package pagefactory.GlobalConstructor;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail
{
	public Gmail(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@name='identifier']")
	WebElement Signin_email;
	
	@FindBy(xpath = "//content[contains(.,'Next')]")
	WebElement next_btn;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement Sigin_password;
	

	String Input_useremail="qadarshan@gmail.com";
	String Input_password="hello12345";
	
}
