package collectionsasst;

import java.util.ArrayList;
import java.util.List;

public class duplicates {
	ArrayList<Integer> removeduplicates(ArrayList<Integer> list1,ArrayList<Integer> list2){
		
		 for (int i : list1) {
			  
	            // If this element is not present in newList
	            // then add it
	            if (!list2.contains(i)) {
	  
	                list2.add(i);
	            }
	        }
	  
	        // return the new list
	        return list2;
	}

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l1.add(1);
		l1.add(3);
		l1.add(3);
		l1.add(10);
		duplicates d=new duplicates();
		ArrayList<Integer> list3=d.removeduplicates(l1,l2);
		System.out.println("ArrayList with duplicates removed: "
                + list3);
		
		
	}

}
