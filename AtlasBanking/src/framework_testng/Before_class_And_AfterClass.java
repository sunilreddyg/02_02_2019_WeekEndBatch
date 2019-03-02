package framework_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Before_class_And_AfterClass {
 
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("browser initiated");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("browser terminated");
  }
  
  
  @Test
  public void tc001() 
  {
	  
	  Reporter.log("tc001 executed");
  }
  
  
  @Test
  public void tc002() 
  {
	  
	  Reporter.log("tc002 executed");
  }
  
  
  @Test
  public void tc003() 
  {
	  
	  Reporter.log("tc003 executed");
  }
  

}
