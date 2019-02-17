package robot_actions;


import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robot_Mouse_Actions 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Create object for Robot framework
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		robot.mouseMove(290, 200);
		
		//click mouse
		Thread.sleep(2000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
	
		
				
		

	}

}
