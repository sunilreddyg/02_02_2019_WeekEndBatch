package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_copy_String 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
	
		
		//launch Notepad file at runtime.
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		
		
		String text="Selenium automates browsers. "
				+ "That's it! What you do with that power is entirely up to you.";
		
		//Select String before copy to clipboard
		StringSelection Stext=new StringSelection(text);
		//Get Runtime system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//set copied text content to clicpboard
		clipboard.setContents(Stext, Stext);

		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);

		//Perform ctrl+V action to paste selected content into notepad file
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		//release key 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		

		//Use ctrl+S  to save file
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		//Release ctrl
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		//New String selection
		String path="D:\\02_02_2019\\AtlasBanking\\src\\robot_actions\\OP.txt";
		StringSelection Spath=new StringSelection(path);
		clipboard.setContents(Spath, Spath);
		
		//use ctrl+V  
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		//Release ctrl
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(4000);
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);

	}

}
