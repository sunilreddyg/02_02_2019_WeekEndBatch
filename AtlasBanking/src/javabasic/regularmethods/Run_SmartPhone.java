package javabasic.regularmethods;

public class Run_SmartPhone 
{

	public static void main(String[] args) 
	{
		 /*
		  * to run methods create object for class
		  * 	Classname obj=new Classname();
		  * 	obj.methodname();
		  */
		
		SmartPhone obj=new SmartPhone();
		obj.touch();
		obj.camera();
		
		
		/*
		 * Calling method with instance
		 * 		
		 * 		new Classname().methodname();
		 */
		
		new SmartPhone().touch();
		new SmartPhone().camera();
		
		
		
		
		
	}

}
