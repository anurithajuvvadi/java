package java_tutorial;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapexample {

	public static void main(String[] args) {
Map<Integer,String> m=new HashMap<Integer,String>();
m.put(1,"scala");
m.put(2,"java");
m.put(3,"python");
m.put(4,".net");
System.out.println(m);
for(Map.Entry map:m.entrySet()) {
    System.out.println(map.getKey()+" "+map.getValue());  
}  
m.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
m.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);


	}

}
