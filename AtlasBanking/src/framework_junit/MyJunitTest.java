package framework_junit;

import org.junit.Ignore;
import org.junit.Test;

public class MyJunitTest 
{

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
	
	@Test
	public void test3() 
	{
		System.out.println("test3 executed");
	}

}
