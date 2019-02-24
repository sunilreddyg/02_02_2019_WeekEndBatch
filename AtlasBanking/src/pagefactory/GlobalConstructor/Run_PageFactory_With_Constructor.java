package pagefactory.GlobalConstructor;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Run_PageFactory_With_Constructor {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		Gmail gmail=new Gmail(driver);
		gmail.Signin_email.clear();
		gmail.Signin_email.sendKeys(gmail.Input_useremail);
		
		gmail.next_btn.click();
		new WebDriverWait(driver, 20).until
		(ExpectedConditions.visibilityOf(gmail.Sigin_password));
		
		gmail.Sigin_password.clear();
		gmail.Sigin_password.sendKeys(gmail.Input_password);
		
		gmail.next_btn.click();
	}

}
