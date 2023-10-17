package java_tutorial;

import java.util.Scanner;

public class arrayelement {

	public static void main(String[] args) {
int arr[]=new int[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
	
}
System.out.println("enter the element to search");
int x=sc.nextInt();
for(int i=0;i<arr.length;i++) {
	if(arr[i]==x) {
		System.out.println(x+" is present");
	}
}
}

	}


