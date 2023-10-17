package java_tutorial;

import java.util.Collections;
import java.util.Objects;
import java.util.Stack;

public class stackexample {

	public static void main(String[] args) {
		Stack<String> l1= new Stack<>();
		Stack<String> l2= new Stack<>();


// Add elements to Stack
l1.push("Dog");
l1.push("Horse");
l1.push("Cat");
System.out.println("Initial Stack: " + l1);

// Remove element stacks
String element = l1.pop();
System.out.println("Removed Element: " + element);
Collections.sort(l1,Collections.reverseOrder());
System.out.println(Collections.min(l1));
System.out.println(Collections.max(l1));
if(l1.size() == l2.size())    ///finding common elements
{
    for (int i = 0; i < l1.size(); i++) {
        if ( Objects.equals(l1.get(i), l2.get(i)) )
            System.out.println("Common element = "+l1.get(i));
    }
}
else
    System.out.println("Size of both the stack is not same.");


	}

}
