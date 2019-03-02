package datadriver_Framework.Propertyfiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Data_To_PropertyFiels {

	public static void main(String[] args) throws IOException 
	{
	
		//Create object for Property file
		Properties output=new Properties();
		
		output.setProperty("res1", "Testpass");
		output.setProperty("res2", "Testpass");
		output.setProperty("res3", "TestFail");
		output.setProperty("res4", "Testpass");
		output.setProperty("res5", "Testpass");
		
		
		//Create output file
		String filepath="src\\datadriven\\propertyFiles\\";
		FileOutputStream fo=new FileOutputStream(filepath+"Output.properties");
		//Store all repository date to outptu file
		output.store(fo, "Test_login_Result");

	}

}
