package collectionsasst;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class lhashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();    
		   map.put(1,"Mango");  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		       
		   System.out.println("printing Hashmap elements");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
	}

}
