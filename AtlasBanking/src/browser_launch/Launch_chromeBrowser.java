package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_chromeBrowser {

	public static void main(String[] args) 
	{
		
		/*
		 * URl:--> https://chromedriver.storage.googleapis.com/index.html?path=2.46/
		 * 			Download w.r.t OS and unzip filelocaiton to project folder.
		 */
		
		
		//Set runtime environment path before launch chrome browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();  //launch browser
		chrome.get("http://facebook.com");
	}

}
