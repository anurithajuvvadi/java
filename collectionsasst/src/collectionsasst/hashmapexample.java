package collectionsasst;

import java.util.HashMap;
import java.util.Map;

public class hashmapexample {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();    
		   map.put(1,"Mango");  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		       
		   System.out.println("printing Hashmap elements");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   System.out.println("isempty method: "+ map.isEmpty());
		   System.out.println("keys in map: "+map.keySet());
		   map.remove(2);
		   map.replace(3,"guava");
		   for(Map.Entry m : map.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  
		   System.out.println("size of map: "+map.size());
		   System.out.println("values in map: "+map.values());
		   
	}

}
