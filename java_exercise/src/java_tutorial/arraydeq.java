package java_tutorial;

import java.util.ArrayDeque;
import java.util.Deque;

public class arraydeq {

	public static void main(String[] args) {
		Deque<String> dq1 = new ArrayDeque<String>(); 
		dq1.add("a");
		dq1.add("b");
		dq1.add("c");
		dq1.add("d");
		dq1.add("e");
		System.out.println("dq1 elements are "+dq1);
	
		Deque<String> dq2 = new ArrayDeque<String>(); 
		dq2.add("e");
		dq2.add("f");
		dq2.add("g");
		dq2.add("h");
		dq2.add("i");
		System.out.println("dq2 elements are "+dq2);
		
dq1.addFirst("first");
dq1.addLast("last");
System.out.println(dq1.contains("h"));
System.out.println(	dq1.element());
System.out.println(dq1.getFirst());
System.out.println(dq1.getLast());
System.out.println(dq1.hashCode());
System.out.println(dq1.isEmpty());
System.out.println(dq1.equals(dq2));
System.out.println(dq1.offer("a"));
System.out.println(dq1.offerFirst("FIRST"));
System.out.println(dq1.offerLast("LAST"));
System.out.println(dq1.peek());
System.out.println(dq1.peekFirst());
System.out.println(dq1.peekLast());
System.out.println(dq1.poll());
System.out.println(dq1.pollFirst());
System.out.println(dq1.pollLast());
System.out.println(dq1.pop());
dq1.push("anuritha");
System.out.println(dq1.size());
		
		
	}

}
