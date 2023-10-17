package java_tutorial;

import java.util.Scanner;

public class elementremove {

	public static void main(String[] args) {
		int [] arr1=new int[5];
		int [] arr2=new int[5];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
			
		}
		System.out.println("enter the index to delete");
		int x=sc.nextInt();
		for(int i=0;i<arr1.length;i++) {
			if(i==x) {
				continue;
			}
			arr2[i]=arr1[i];
			
		}
		for(int i=0;i<arr1.length;i++) {
		System.out.println(arr2[i]);
		}
	}

}
