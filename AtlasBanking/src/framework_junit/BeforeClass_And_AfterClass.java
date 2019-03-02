package framework_junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BeforeClass_And_AfterClass
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("browser initiated");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("browser closed");
	}

	@Test
	public void test() 
	{
		System.out.println("test executed");
	}
	
	@Ignore
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	
	@Test
	public void test2() 
	{
		System.out.println("test2 executed");
	}
}
