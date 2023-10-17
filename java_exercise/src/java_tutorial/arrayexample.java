package java_tutorial;

import java.util.Scanner;

public class arrayexample {

	public static void main(String[] args) {
int [] arr1=new int[5];
int sum=0;
Scanner sc=new Scanner(System.in);
for(int i=0;i<arr1.length;i++) {
	arr1[i]=sc.nextInt();
	
}
for(int i=0;i<arr1.length;i++) {
	sum=sum+arr1[i];
	
}
System.out.println(sum);
int average=sum/arr1.length;
System.out.println(average);


	}

}
