package robot_actions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.apache.commons.io.IOUtilsWriteTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Capturescreen 
{
	public static void main(String[] args) throws AWTException, IOException, InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		
		//Identify Search button
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);
		
		
		//Capture screen when alert presented
		Dimension Screen_size=Toolkit.getDefaultToolkit().getScreenSize();
		//Create object for Robot
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		//USing robot create screenshot
		BufferedImage imageScreen=robot.createScreenCapture(new Rectangle(Screen_size));
		File filepath=new File("D:\\02_02_2019\\AtlasBanking\\src\\robot_actions\\image.JPG");
		ImageIO.write(imageScreen, "JPG", filepath);
		
		
		/*
		 * => 
		 */
	}

}
