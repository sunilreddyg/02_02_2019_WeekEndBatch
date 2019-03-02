package framework_junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses
 ({
  MyJunitTest.class,
  BeforeClass_And_AfterClass.class,
  WebDriver_JunitTestcase.class,
  })
public class Junit_With_Suite 
{

	/*
	 * Note:--> Junit suite execute set of class orderwise.
	 */
	
	
}
