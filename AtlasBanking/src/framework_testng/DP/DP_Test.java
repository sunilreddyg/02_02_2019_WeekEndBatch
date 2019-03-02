package framework_testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DP_Test
{
  @Test(dataProvider = "dp")
  public void user_search(String uid,String Mobile, String operator) 
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
    };
  }
}
