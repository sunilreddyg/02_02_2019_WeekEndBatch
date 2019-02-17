package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Action 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
		//Enable mouse and keyboard interaction at automation browser
		Actions action=new Actions(driver);
		
		//identify location
		WebElement Products_menu=driver.findElement(By.linkText("Products"));
		//perform mouse hover action on products menu
		action.moveToElement(Products_menu).perform();
		Thread.sleep(5000);
		
		
		//identify card submenu location
		WebElement Cards_Smenu=driver.findElement(By.linkText("Cards"));
		//perform mousehover action on Cards submenu
		action.moveToElement(Cards_Smenu).perform();
		Thread.sleep(5000);
		
		
		//Identify Credit cards Sub list menu
		WebElement CreditCards=driver.findElement(By.linkText("Credit Cards"));
		action.click(CreditCards).perform();
		
		
		
		
		
		
		

	}

}
