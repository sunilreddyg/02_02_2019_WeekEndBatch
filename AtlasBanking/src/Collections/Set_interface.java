package Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_interface 
{

	public static void main(String[] args) 
	{
		/*
		 * =>Unorder collection of objects
		 * => doesn't allow duplicates
		 */
		
		Set<String>set=new HashSet<String>();
		set.add("IDE");
		set.add("RC");
		set.add("WD");
		set.add("GRID");
		set.add("APPIUM");
		set.add("IDE");
		
		//Get Size of object
		int count=set.size();
		System.out.println("Size of objects => "+count);
		
		//Remote object from set
		set.remove("APPIUM");
		
		//Verify object available in collection
		boolean flag=set.contains("APPIUM");
		System.out.println("object status is => "+flag);

		/*//Read Next Object at collection
		String next_objet=set.iterator().next();
		System.out.println(next_objet);
		
		*/
		//Apply foreach loop to print all toolnames
		for (String Eachtool : set)
		{
			System.out.println("=>"+Eachtool);
		}
	
		
		
		
		
		
	}

}
