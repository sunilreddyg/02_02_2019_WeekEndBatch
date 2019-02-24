package method_parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository 
{
	
	WebDriver driver=null;   //Global variable
	WebDriverWait wait;
	/*
	 * KeywordName:--> Launch browser [firefox,chrome,ie]
	 * Author:-->
	 * CreatedDate:-->
	 * ReviewedBy;-->
	 * Parameter:--> Local parameter
	 */
	public void launch_browser(String browsername)
	{
		switch (browsername) 
		{
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			driver=new InternetExplorerDriver();
			break;
			
		case "chrome":
			driver=new ChromeDriver();
			break;

		default:System.out.println("Browser mismatch");
			break;
		}
	}
	
	
	/*
	 * KeywordName:--> Load Diff webpages
	 * Author:-->
	 * CreatedDate:-->
	 * ReviewedBy;-->
	 * Parameter:--> Local parameter
	 */
	public void LoadApp(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void set_timeout(int time_in_sec)
	{
		//Implicit wait
		driver.manage().timeouts().implicitlyWait
		(time_in_sec, TimeUnit.SECONDS);
		
		//Explicitwait
		wait=new WebDriverWait(driver, time_in_sec);
	}
	
	
	/*
	 * KeywordName:--> enter text into editbox
	 * Author:-->
	 * CreatedDate:-->
	 * ReviewedBy;-->
	 * Parameter:--> Local parameter
	 */
	public void Enter_text(String Element_xpath,String input)
	{
		WebElement editbox=driver.findElement(By.xpath(Element_xpath));
		editbox.clear();
		editbox.sendKeys(input);
	}
	
	
	/*
	 * KeywordName:--> enter text into editbox
	 * Author:-->
	 * CreatedDate:-->
	 * ReviewedBy;-->
	 * Parameter:--> Local parameter
	 */
	public void Enter_text(By locator,String input)
	{
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(locator));
		WebElement editbox=driver.findElement(locator);
		editbox.clear();
		editbox.sendKeys(input);
	}
	
	
	/*
	 * KeywordName:--> enter text into editbox using pagobject
	 * Author:-->
	 * CreatedDate:-->
	 * ReviewedBy;-->
	 * Parameter:--> Local parameter
	 */
	public void Enter_text(WebElement pageobject,String input)
	{
		wait.until(ExpectedConditions.visibilityOf(pageobject));
		WebElement editbox=pageobject;
		editbox.clear();
		editbox.sendKeys(input);
	}
	
	
	/*
	 * MethodName:--> Select Dropdown using option name
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Select_dropdown(By locator, String Option_name)
	{
		//wait until Element visible at webpage
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(locator));
		
		WebElement Dropdown=driver.findElement(locator);
		new Select(Dropdown).selectByVisibleText(Option_name);
	}
	
	
	/*
	 * MethodName:--> Click Element [Radiobutton, checkbox,link,button,list,image...etc]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Click_element(By locator)
	{
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(locator));
		driver.findElement(locator).click();
	}
	
	
	/*
	 * MethodName:--> waitandclick link  [Only links]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Wait_and_click(By locator)
	{
		wait.until(ExpectedConditions
				.elementToBeClickable(locator)).click();
	}
	
	/*
	 * MethodName:--> waitforElementto visible
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void wait_for_Element_visible(By locator)
	{
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(locator));
	}
	
	
	/*
	 * MethodName:-->Mouse hover on element
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void MouseHover(By locator)
	{
		WebElement Element=driver.findElement(locator);
		new Actions(driver).moveToElement(Element).build().perform();
	}
	
	
	/*
	 * MethodName:-->ContextClick
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void RightClick_OnElement(By locator)
	{
		WebElement Element=driver.findElement(locator);
		new Actions(driver).contextClick(Element).perform();
	}
	
	
	
	/*
	 * MethodName:-->switch to window using window title
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void switchto_window(String win_title)
	{
		//Get all window dyamic id's
		Set<String> allwindows=driver.getWindowHandles();
				
		//Apply foreach loop ot iterate 
		for (String Eachwindow : allwindows) 
		{
			driver.switchTo().window(Eachwindow);
			//Get Current window at runtime
			String pagetitle=driver.getTitle();
					
			if(pagetitle.contains(win_title))
			{
				break;
			}
				
		}	
	}//window
	
	
	/*
	 * Keyword:--> Take screen with timestamp
	 */
	public void CaptureScreen(String imagename)
	{
		//Java time stampt
		Date d=new Date();   //Current system date in default format
		//create simple date format
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//convert default date using simple date format
		String time=df.format(d);
				
		try {
					
			//Capture screen and convert into file format.
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("screens\\"+time+imagename+".png"));
					
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	
	
	
	

}
