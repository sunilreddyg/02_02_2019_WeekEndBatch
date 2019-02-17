package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser {

	public static void main(String[] args) 
	{
		/*
		 * Download geckodriver
		 * 	=> https://github.com/mozilla/geckodriver/releases
		 * 	=> Download w.r.t browser verison and OS
		 * 	=> After unzip place geckodriver.exe file under project.
		 */
		
		//Setup Runtime environment path before launch firefox
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();    //Launch browser
		firefox.get("http://google.com");
	}

}
