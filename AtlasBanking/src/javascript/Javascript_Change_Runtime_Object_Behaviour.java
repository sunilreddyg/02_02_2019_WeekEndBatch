package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Change_Runtime_Object_Behaviour {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);

		//Identify Location at webpage
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		
		//At runtime change editbox behaviour to disable
		js.executeScript("arguments[0].disabled=true;",Firstname);
		Thread.sleep(3000);
		
		//At runtime change editbox behaviour to enabled
		js.executeScript("arguments[0].disabled=false;",Firstname);
		Thread.sleep(3000);
		
		
		//At runtime change editbox behaviour to hide
		js.executeScript("arguments[0].style.display='none'",Firstname);
		Thread.sleep(3000);
		
		//At runtime change editbox behaviour to hide
		js.executeScript("arguments[0].style.display='block'",Firstname);
		Thread.sleep(3000);

		
	}

}
