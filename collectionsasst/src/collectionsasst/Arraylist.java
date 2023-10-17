package collectionsasst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
List<Integer> l1=new ArrayList<Integer>();
l1.add(1);
l1.add(3);
l1.add(2);
l1.add(4);
l1.add(6);
System.out.println("printing the list elements");
Iterator itr=l1.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
System.out.println("converting list elements to array");
Integer[] arr = new Integer[l1.size()];

for (int i = 0; i < l1.size(); i++) {
    arr[i] = l1.get(i);
}
for (Integer x : arr)
    System.out.print(x + " ");
}


	}


