package java_tutorial;

import java.util.PriorityQueue;
import java.util.Queue;

public class queueexample {

	public static void main(String[] args) {
Queue<Integer> q1=new PriorityQueue<Integer>();
Queue<Integer> q2=new PriorityQueue<Integer>();

q1.add(1);
q1.add(2);
q1.add(3);
q1.add(4);
q1.add(5);
q1.add(6);
System.out.println("q1 elements are "+q1);

q2.add(5);
q2.add(6);
q2.add(7);
q2.add(8);
q2.add(9);
q2.add(10);

System.out.println("q2 elements are "+q2);


System.out.println("contains method: "+q1.contains(1));
System.out.println("element method: "+q1.element());
System.out.println("equals method: "+q1.equals(q2));
System.out.println("getclass method: "+q1.getClass());
System.out.println("isempty method: "+q1.isEmpty());
System.out.println("peek method: "+q1.peek());
System.out.println("poll method: "+q1.poll());
System.out.println("remove method: "+q1.remove());
System.out.println("size method: "+q1.size());


	}

}
