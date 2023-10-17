package mock;

import java.util.Scanner;

public class stringstart {

	public static void main(String[] args) {
		System.out.println("enter main string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println("enter sub string");
		String s2=sc.next();
		if(s1.startsWith(s2)) {
			System.out.println("TRUE");
		}
		else
			System.out.println("FALSE");

			}
	}


