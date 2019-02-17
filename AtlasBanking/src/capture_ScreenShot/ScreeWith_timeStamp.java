package capture_ScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreeWith_timeStamp 
{

	public static void main(String[] args)
	{
		
		//brower initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		
		//Identify frame and switch to it
		WebElement Demo_frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Demo_frame);
		
		
		WebElement Element=driver.findElement(By.xpath("//li[contains(.,'Item 5')]"));
		new Actions(driver).moveToElement(Element).perform();
		

		//Java time stampt
		Date d=new Date();   //Current system date in default format
		//create simple date format
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//convert default date using simple date format
		String time=df.format(d);
		
		try {
			
			//Capture screen and convert into file format.
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("screens\\"+time+"image.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
