package framework_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BeforeMethod_And_AfterMethod {
 
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("precondition before method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("post condition after method");
  }
  
  
  @Test
  public void tc001() 
  {
	  
	  Reporter.log("tc001 executed",true);
  }
  
  
  @Test
  public void tc002() 
  {
	  
	  Reporter.log("tc002 executed",true);
  }
  
  
  @Test
  public void tc003() 
  {
	  
	  Reporter.log("tc003 executed",true);
  }
  
}
