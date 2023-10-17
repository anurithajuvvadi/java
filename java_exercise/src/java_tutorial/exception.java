package java_tutorial;

import java.util.Scanner;

class userdefinedexception extends Exception{
	public userdefinedexception(String s) {
		super(s);
	}
}

public class exception {
	
	

	public static void main(String[] args) {
		int balance;
		Scanner sc=new Scanner(System.in);
		balance=sc.nextInt();
		try {
			if(balance<1000) {
				throw new userdefinedexception("balance is low ");
			}
			
		}
		catch(userdefinedexception e) {
			System.out.println(e);
		}

	}

 
}
