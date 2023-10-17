package java_tutorial;

import java.util.Scanner;

public class numberexample {

	public static void main(String[] args) {
		
		System.out.println("enter choice");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.println("enter number for case1");
		int num1=sc.nextInt();
		switch(choice) {
		case 1:if(num1>0) {
			System.out.println("positive");
		}
		else {
			System.out.println("negative");

		}
		break;
		case 2:
			if(num1%2==0) {
				System.out.println("even");

			}
			else {
				System.out.println("odd");

			}
			break;
		case 3:
		}
		

	}

}
