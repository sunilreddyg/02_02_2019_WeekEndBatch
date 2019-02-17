package capture_ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screen_Capture 
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
		
		
		/*
		 * Note:--> To use fileutilities in local system we need
		 * 			to add below jar files to selenium project.
		 * 
		 * 		URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 		Download zip format file from binaries
		 * 		FIlename is => commons-io-2.6-bin.zip
		 * 		After download completed unzip file and add all-
		 * 				executable jar files to current project
		 * 		
		 */
		
		
	
		try {
			
			//Capture screen and convert into file format.
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("screens\\image.png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
