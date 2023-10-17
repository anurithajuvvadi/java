package collectionsasst;

import java.util.Map;
import java.util.TreeMap;

public class treemapexample {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(1,"java");    
	      map.put(4,"python");    
	      map.put(3,"bigdata");    
	      map.put(2,"hadoop");  
	      map.put(2, ".net");
	      map.put(3,"bigdata"); 
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	      System.out.println("key greater than given key: "+map.ceilingEntry(2));
	      System.out.println("containskey method: "+ map.containsKey(3));
	      System.out.println("containsvalue method: "+ map.containsValue("bigdata"));
	      System.out.println("reverse order: "+map.descendingMap());
	      System.out.println("ascending order: "+map.entrySet());
	      System.out.println("leastkey: "+map.firstEntry());
	      System.out.println("value of the key 4: "+map.get(4));
	      System.out.println("keys less than key 3: "+map.headMap(3));
	}

}
