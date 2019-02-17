package javascript;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Using_Xpath
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Enable javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);

		
		//Type Characters into editbox using js_executor
		js.executeScript("document.getElementById('u_0_j').value='Sam'");
		js.executeScript("document.getElementById('u_0_l').value='Newuser'");
	
		
		//Select dropdown options using js_executor
		js.executeScript("document.getElementById('day').value='12'");
		js.executeScript("document.getElementById('month').value='5'");
		js.executeScript("document.getElementById('year').value='2014'");
		
		
		//Select radio button using xpath
		WebElement Female_Radio_btn=driver.findElement(By.xpath("//input[@value='1']"));
		js.executeScript("arguments[0].click()", Female_Radio_btn);
		Thread.sleep(5000);
		
		//select radio button using xpath
		WebElement male_radio_btn=driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].click()",male_radio_btn);
		
		
	}

}
