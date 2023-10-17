package collectionsasst;

import java.util.HashSet;
import java.util.Set;

public class Hashsetexample {

	public static void main(String[] args) {
Set<String> hs1 = new HashSet<String>();
        
        hs1.add("A");
        hs1.add("B");
        hs1.add("C");
        hs1.add("D");
        System.out.println( hs1.contains("C") );
	}

}
