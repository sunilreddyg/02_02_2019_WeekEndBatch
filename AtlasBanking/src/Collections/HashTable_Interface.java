package Collections;

import java.util.Hashtable;
import java.util.Set;

public class HashTable_Interface {

	public static void main(String[] args) 
	{
		
		//Note:--> Pair values to store
		Hashtable<Integer, String> map=new Hashtable<>();
		map.put(1, "IDE");
		map.put(2, "RC");
		map.put(3, "WD");
		map.put(4, "WD");
		
		String tool=map.get(3);
		System.out.println(tool);
		
		
		//capture all keysets
		Set<Integer> keys=map.keySet();
		//Apply foreach
		for (Integer keyname : keys)
		{
			System.out.println(keyname+"  "+map.get(keyname));
		}
	}

}
