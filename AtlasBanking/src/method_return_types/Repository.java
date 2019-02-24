package method_return_types;


import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository 
{
	
	public WebDriver driver;
	public WebDriverWait wait;
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
		driver.manage().timeouts().implicitlyWait(time_in_sec, TimeUnit.SECONDS);
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement editbox=driver.findElement(locator);
		editbox.clear();
		editbox.sendKeys(input);
	}
	
	
	/*
	 * MethodName:--> Select Dropdown using optioname
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
		driver.findElement(locator).click();
	}
	
	
	/*
	 * MethodName:--> waitandclick [Radiobutton, checkbox,link,button,list,image...etc]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Wait_and_click(By locator)
	{
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
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
	
	
	
 //=======user defined keywords ==============
	
	
/*
 * MethodName:-->Verify title presented at webpage
 * Author:-->
 * CreatedON:-->
 * ReviewedBy:-->
 * Parametersused:-->
 * Lasupdated Date:--->
 */
 public boolean IsTitle_presented(String Exp_title)
 {
	boolean flag= wait.until(ExpectedConditions
			 .titleContains(Exp_title));
	
	return flag;
 }
	
	
 /*
  * MethodName:-->Verify url presented at webpage
  * Author:-->
  * CreatedON:-->
  * ReviewedBy:-->
  * Parametersused:-->
  * Lasupdated Date:--->
  */	
 public boolean IsUrl_Presented(String Exp_url)
 {
	boolean flag=wait.until(ExpectedConditions
			.urlContains(Exp_url));
	return flag;
 }
 
 
 /*
  * MethodName:-->Verify text visble at location
  * Author:-->
  * CreatedON:-->
  * ReviewedBy:-->
  * Parametersused:-->
  * Lasupdated Date:--->
  */
 public boolean Istext_visible_At_location(By location,String Exp_text)
 {
	 boolean flag=wait.until(ExpectedConditions
			 .textToBePresentInElementLocated(location, Exp_text));
	 return flag;
 }
 
 
 /*
  * MethodName:-->Verify userinput available at editbox
  * Author:-->
  * CreatedON:-->
  * ReviewedBy:-->
  * Parametersused:-->
  * Lasupdated Date:--->
  */
 public boolean IsInput_Available_At_Editbox(By location,String Input)
 {
	 boolean flag=wait.until(ExpectedConditions
			 .textToBePresentInElementValue(location, Input));
	 return flag;
 }
 
 
 
 /*
  * MethodName:-->Verify Alert presented at webpage
  * Author:-->
  * CreatedON:-->
  * ReviewedBy:-->
  * Parametersused:-->
  * Lasupdated Date:--->
  */
 
 public boolean isAlert_presented()
 {
	 try {
		 wait.until(ExpectedConditions.alertIsPresent());
		 return true;
	} catch (TimeoutException e) {
		return false;
	}
	 
 }
 
 
 
 
 /*
  * MethodName:-->Close Alert window
  * Author:-->
  * CreatedON:-->
  * ReviewedBy:-->
  * Parametersused:-->
  * Lasupdated Date:--->
  */
 public void Closer_Alert()
 {
	 if(isAlert_presented())
		 driver.switchTo().alert().accept();
	 else
		 System.out.println("Alert not presented");
 }
	
 
 
 /*
	 * Methodname:---> Get Table CellAdress Using Row number and Column Number
	 * Author:--->
	 * create on:--->
	 * reviewed by:--->
	 * last updated date:--->
	 * parameters used:--->local parameters
	 */
	public WebElement Get_Table_CellAddress(String Table_xpath,int Row, int cell)
	{
		
		//Target table
		WebElement table=driver.findElement(By.xpath(Table_xpath));
		
		//Find number of rows available with in table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//Target fifth row 
		WebElement selected_row=rows.get(Row);
		
		//On Selected row find list of cells available
		List<WebElement> cells=selected_row.findElements(By.tagName("td"));
		
		//Get zero cell ddata
		WebElement Celladdress=cells.get(cell);
		
		return Celladdress;
	}
	
	
	
	/*
	 * Methodname:---> return webtable celladdress [Using record name and Column name]
	 * Author:--->
	 * create on:--->
	 * reviewed by:--->
	 * last updated date:--->
	 * parameters used:--->local parameters
	 */
	public  WebElement Webtable_Dynamic_CellAdress(String tablexpath, String recordname, int col)
	{
		//Target Webtable
		WebElement table=driver.findElement(By.xpath(tablexpath));
										
		//Find Number of rows available in table
		List<WebElement> Allrows=table.findElements(By.tagName("tr"));
		System.out.println(Allrows.size());
									
		boolean flag=false;
		WebElement CellArea=null;
		//Iterate for number of row times
		for (int i = 1; i < Allrows.size(); i++) 
		{
				//target 3rd row
				WebElement Selected_row=Allrows.get(i);
				//System.out.println(Selected_row.getText());
											
				//Find 3rd row column count
				List<WebElement> All_columns=Selected_row.findElements(By.tagName("td"));
										
				//Iteration for columns
				for (int j = 0; j < All_columns.size(); j++) 
				{
					//Target 3rd column
					WebElement CellAddress=All_columns.get(j);
												
					//get celltext
					String CellData=CellAddress.getText();
										
										
					if(CellData.equals(recordname))
					{
						flag=true;
						CellArea=All_columns.get(col);
						break;//break column iteration
										
					}
										
										
				}//col
								
				if(flag==true)
				{
					break; //break row iteration
				}
								
									
		}//row
		System.out.println("record available status  "+flag);
				return CellArea;				
				
								
	}//
	
	
	
	

}
