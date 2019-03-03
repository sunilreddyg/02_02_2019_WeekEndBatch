package framework_testng.BeforeTest_and_AfterTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestSuite1 
{
  @Test
  public void tc001() 
  {
	  System.out.println("tc001 executed");
  }
  
  @Test
  public void tc002() 
  {
	  System.out.println("tc002 executed");
  }
  
  
  @Test
  public void tc003() 
  {
	  System.out.println("tc003 executed");
  }
  
 @AfterSuite
 public void terminate()
 {
	 System.out.println("terminate process");
 }

  
}
