package collectionsasst;

import java.util.ArrayList;
import java.util.List;

public class sumeven {
	static void sumofeven(ArrayList<Integer> l2) {
		int count=0;
		for(int i: l2) {
			if(i%2==0) {
				count=count+i;
			}
			
		}
		System.out.println("sum of even numbers is: "+count);
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(3);
		l1.add(2);
		l1.add(4);
		l1.add(6);
		sumeven s=new sumeven();
		s.sumofeven(l1);
	}

}
