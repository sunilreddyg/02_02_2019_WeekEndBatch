package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Facebook_Homepage 
{
	
	@FindBy(how=How.ID,using="email") 
	WebElement Login_email;
	
	@FindBy(name="pass")
	WebElement Login_password;
	
	@FindBy(xpath = "//input[@value='Log In']")
	WebElement Login_Submit_btn;
	
	
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement SignUp_Firstname_EB;
	
	@CacheLookup
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement SignUp_Surname_EB;
	
	@FindBy(how=How.TAG_NAME,using="select")
	List<WebElement> Signup_Dropdowns;
	
	
	
	//Input data
	String Input_username="9030248855";
	String Input_password="Hello123456";
	String Input_firstname="Newuser";
	String Input_surname="Webdriver";
	
	
	
	
	
}
