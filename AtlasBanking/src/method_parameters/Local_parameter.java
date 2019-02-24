package method_parameters;

public class Local_parameter
{
	
	public void print_tool()
	{
		String name="WebDriver";
		System.out.println(name);
	}
	
	public void print_tool(String toolname)
	{
		String name=toolname;
		System.out.println(name);
	}
	
	public void print_tool(String toolname,double version)
	{
		String name=toolname;
		System.out.println(name+" version is => "+version);
	}
	public static void main(String[] args) 
	{
		//Create object
		Local_parameter obj=new Local_parameter();
		obj.print_tool();
		
		//Calling method using argument
		obj.print_tool("IDE");
		
		//Calling method using multiple arguments
		obj.print_tool("WebDriver", 3.14);
		

	}

}
