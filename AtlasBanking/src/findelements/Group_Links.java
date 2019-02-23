package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//identify facebook homepage footer navigation area
		WebElement Site_links_footer;
		Site_links_footer=driver.findElement(By.cssSelector("div[aria-label='Facebook site links']"));
		//identify number of links at footer
		List<WebElement> nav_links;
		nav_links=Site_links_footer.findElements(By.tagName("a"));
		
		
		//Get size of links
		int linksCount=nav_links.size();
		System.out.println("Number of links at footer is => "+linksCount);
		
		//Iterate for numeber of links
		for (int i = 0; i < linksCount; i++) 
		{
			//target Each link
			WebElement Eachlink=nav_links.get(i);
			//Get name and href of each link
			String linkname=Eachlink.getText();
			String linkhref=Eachlink.getAttribute("href");
			
			System.out.println(linkname+"          "+linkhref);
			
			//click eachlink
			Eachlink.click();
			Thread.sleep(2000);
			
			
			//Get back to homepage
			driver.navigate().back();
			Thread.sleep(3000);
			
			//To Avoid staleelementreference-exception restore all links to global variables
			Site_links_footer=driver.findElement(By.cssSelector("div[aria-label='Facebook site links']"));
			nav_links=Site_links_footer.findElements(By.tagName("a"));
			
		}
		
		
	}

}
