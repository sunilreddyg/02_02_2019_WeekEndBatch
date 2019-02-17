package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executor_commands {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * when to use javascript executor:----->
		 * 
		 * 
		 * Because of cross domain policies browsers enforce your 
		 * script execution may fail unexpectedly and without 
		 * adequate error messaging. mostly happend when trying to access 
		 * another frame. 
		 * 
		 * Note:--> 
		 *  Most times when troubleshooting failure it's 
		 *  best to view the browser's console after 
		 *  executing the WebDriver request.
		 *  
		 *  
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		/*
			//Enable javascript executor on automation browser
			((JavascriptExecutor)driver).executeScript("Write javaScript");
			
		 */
		
		
		//Enable javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Type text into editbox using javascript
		js.executeScript
		("document.getElementById('email').value='9030248855'");
		
		js.executeScript
		("document.getElementById('pass').value='Hello12345'");
		
		//click Signin button
		js.executeScript
		("document.getElementById('loginbutton').click()");
		
		
		
		
		
		
		
		
		
	}
}
