package framework_testng.BeforeTest_and_AfterTest;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_For_Firefox
{
	
	  @BeforeTest
	  public void beforeTest() 
	  {
		  System.out.println("Pretest before firefox launch ");
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("posttest after firefox launch ");
	  }
	  
	  
	  @Test
	  public void login()
	  {
		  Reporter.log("Login completed",true);
	  }

}
