package framework_testng.DP;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_InputData 
{
	
	@DataProvider
	public static String[][] LoginData()
	{
		String data[][]=
			{
					{"arjun","newpwd" },
					{ "vikram","viki123"},
					{ "arun","arun123"},
			};
		
		return data;
	}
	
	

	@Test(dataProvider="LoginData",enabled=false)
	public void Login(String uid,String pwd)
	{
		System.out.println(uid);
		System.out.println(pwd);
	}
	
	
	//Get data from diff class
	@Test(dataProvider="dp",dataProviderClass=DP_Test.class)
	public void search_operator(String uid,String mobile,String operator)
	{
		
		/*
		 * Note1:--> to use dataprovider in diff class we must
		 * 			declare data provider method with statis access specifier
		 * 
		 * Note;--> should define along with method name class name as well
		 */
		
	}
	

}
