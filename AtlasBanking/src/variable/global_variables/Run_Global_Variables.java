package variable.global_variables;

public class Run_Global_Variables 
{

	public static void main(String[] args) 
	{
		//Create object to call methods and variable
		Globalvariables_Using_Webdriver obj;
		obj=new Globalvariables_Using_Webdriver();
		
		//Call browser launch method
		obj.browser_setup();
		
		//Set username and password at runtime before calling login
		obj.username="qadarshan@gmail.com";
		obj.password="hello123456";
		obj.user_login();
		
		
		
		
		

	}

}
