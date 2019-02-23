package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Interface {

	public static void main(String[] args)
	{
		
		/*
		 *  => In order collection of objects and accept
		 *  	duplicates.
		 */
		
		List<String> list=new ArrayList<>();
		list.add("IDE");
		list.add("RC");
		list.add("WD");
		list.add("GRID");
		list.add("APPIUM");
		list.add("IDE");
	
		/*
		 * note:--> because list maintain order we can get any
		 * 			single object from list using index number.
		 * 
		 * 
		 * 		=> get method usefull to target any single object 
		 * 			in collection of objects.
		 */
		String toolname=list.get(2);
		System.out.println(toolname);
		
		
		
		//Apply foreach loop
		for (String eachtool : list)
		{
			System.out.println("=> "+eachtool);
		}
		
		
		//Apply using forloop
		for (int i = 0; i < list.size(); i++) 
		{
			String tool=list.get(i);
			System.out.println("<> "+tool);
		}
		
		
		
		
	}

}
