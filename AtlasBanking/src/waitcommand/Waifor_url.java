package waitcommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waifor_url {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Create object for Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		String Exp_url="https://www.seleniumhq.org/";
		wait.until(ExpectedConditions.urlContains(Exp_url));
		System.out.println("Url verified");
		
		
	}

}
