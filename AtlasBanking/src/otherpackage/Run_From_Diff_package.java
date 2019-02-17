package otherpackage;

import javabasic.StaticMethods.NativeInputs;
import javabasic.regularmethods.SmartPhone;

public class Run_From_Diff_package {

	public static void main(String[] args)
	{
	
		/*
		 * Note1:--> In java programming other package
		 * 		class methods and variables to call
		 * 		we must import package to current class.
		 */
		NativeInputs.keyboard();
		NativeInputs.mouse();
		
		//Calling methods without static 
		SmartPhone obj=new SmartPhone();
		obj.touch();
		obj.camera();

	}

}
