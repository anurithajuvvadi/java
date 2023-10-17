package collectionsasst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class operations {
	void add_to_ArrayList(ArrayList<Integer> l, int x) {
		l.add(x);
	    }	
		
	    /*sort the ArrayList A in ascending order*/
	    void sort_ArrayList_Asc(ArrayList<Integer> A)
	    {
	    	Collections.sort(A);   
	    }
		
	    /*reverses the ArrayList A*/
	    void reverse_ArrayList(ArrayList<Integer> A)
	    {
	    	Collections.sort(A, Collections.reverseOrder());   
	    }
		
	    /*returns the size of the ArrayList A */
	    int size_Of_ArrayList(ArrayList<Integer> A)
	    {
	    	int x=A.size();
			return x;
		
	    }
		
	    /*sorts the ArrayList A in descending order*/
	    void sort_ArrayList_Desc(ArrayList<Integer> A)
	    {
	    	Collections.sort(A, Collections.reverseOrder());	    }
		
	    /*prints space separated 
	    elements of ArrayList A*/
	    void print_ArrayList(ArrayList<Integer> A)
	    {
	        // Your code here
	    }
	

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		//l.addAll([1,2,3,4]);
		int x=20;
		operations o=new operations();
		o.add_to_ArrayList(l, x);
		o.sort_ArrayList_Asc(l);
		o.reverse_ArrayList(l);
		o.size_Of_ArrayList(l);
		o.sort_ArrayList_Desc(l);
		o.print_ArrayList(l);
		
		
		
		
		
	}

}
