package framework_testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DP_Test
{
  @Test(dataProvider = "dp",enabled=false)
  public void user_search(String name,String mobile,String operator) 
  {
	  
	  
  }
  
  
  @Test(dataProvider="SampleData")
  public void EmployeeInfo(String Name,String EmpID)
  {
	  
  }
  
  

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { "user1","9030248855","Airtel" },
      new Object[] { "user2","9030848855","DOCOMO" },
      new Object[] { "user3","9441134905","BSNL" },
      new Object[] { "user4","9441134565","BSNL" },
      new Object[] { "user5","9441134544","Airtel" },
    };
  }
  
  
  @DataProvider
  public String[][] SampleData()
  {
	  String data[][]=
		  {
				  {"Arun","Emp1"},
				  {"Vijay","Emp2"},
				  {"Surya","Emp3"},
				  {"raju","Emp4"},
		  };
	  return data;
  }
  
  
  
  
  
  
  
}
