package mock;

import java.util.Scanner;

public class stringlast {

	public static void main(String[] args) {
		System.out.println("enter main string");
Scanner sc=new Scanner(System.in);
String s=sc.next();
System.out.println("enter sub string of length 2");
String s2=sc.next();
if(s.endsWith(s2)) {
	System.out.println("TRUE");
}
else
	System.out.println("FALSE");

	}

}
