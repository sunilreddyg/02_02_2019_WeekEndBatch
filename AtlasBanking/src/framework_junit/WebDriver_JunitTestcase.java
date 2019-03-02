package framework_junit;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebDriver_JunitTestcase 
{
	public static WebDriver driver;

	
	@Test
	public void verify_Signup_link()
	{
		driver.findElement(By.linkText("Sign Up")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Sign up link verified expected title displayed");
	}
	
	
	
	@Test
	public void verify_login_link()
	{
		driver.findElement(By.linkText("Log In")).click();
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		System.out.println("Login link verified expected title presented");
	}
	
	
	@Test
	public void verify_Messenger_link()
	{
		driver.findElement(By.linkText("Messenger")).click();
		Assert.assertEquals("https://www.messenger.com/", driver.getCurrentUrl());
		System.out.println("Messenger link verified expected url presented");
	}
	

	@Before
	public void setUp() throws Exception 
	{
		driver.get("http://facebook.com");
	}

	@After
	public void tearDown() throws Exception 
	{
		//Create simple date format
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Get system current date
		Date d=new Date();   //import java.util
		//using simple date formatter convert system current date
		String time=df.format(d);
		
		

		//Take screen at runtime and convert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"image.png"));
			
			
	}


	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
	}

}
