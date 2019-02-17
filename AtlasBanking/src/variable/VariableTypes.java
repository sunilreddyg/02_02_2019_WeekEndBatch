package variable;

public class VariableTypes
{
	String toolname="selenium";      //Instant variable [Global variable]
	static String sel_version="3.14"; //Class variable   [Global variable]
	
	public void method1()
	{
		String name="MQ";  //Local variable
	}
	
	
	public void method2()
	{
		System.out.println("global variable is => "+toolname);
	}
	
	
	
	public static void main(String[] args) 
	{
		
		//Create object for class
		VariableTypes obj=new VariableTypes();
		obj.method2();
		
		//Call Global variable
		String latesttool=obj.toolname;
		System.out.println("latesttool training starts  "+latesttool);

		//Static Variable Can call without object creation
		System.out.println("Static Variable is => "+sel_version);
		
	}

}
