package java_tutorial;

import java.util.Scanner;

public class userchoice {

	public static void main(String[] args) {
		System.out.println("enter the no of elements");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int pcount=0;int ncount=0;int zcount=0;
		 int arr[]=new int[x];
		 System.out.println("enter elements");	 
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>0) {
				 pcount++;
			 }
			 else if(arr[i]<0) {
				 ncount++;
			 }
			 else if(arr[i]==0) {
				 zcount++;
			 }
		 }
		 System.out.println("no of positive numbers are: "+pcount);
		 System.out.println("no of negative numbers are: "+ncount);
		 System.out.println("no of zeros are: "+zcount);

	}

	}


