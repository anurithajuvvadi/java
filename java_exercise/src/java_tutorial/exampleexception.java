package java_tutorial;

import java.util.Scanner;

class userdefinedexception1 extends Exception{
	public userdefinedexception1(String s) {
		super(s);
	}

}
public class exampleexception {
	static int bal=3500;
	static void deposit(int x) {
	  int depositamount=x;
	  try {
	  if(depositamount==0) {
		  throw new userdefinedexception1("invalid amount exception");
	  }
	  }
	  catch(userdefinedexception1 e) {
			System.out.println(e);
		}
		
		
	}
public static void withdraw(int y) {
	int withdrawamount=y;
	try {
	if(withdrawamount==0) {
		  throw new userdefinedexception1("invalid amount exception");
	  }
	if(withdrawamount>bal) {
		throw new userdefinedexception1("insufficient funds exception");
	}
	}
	catch(userdefinedexception1 e) {
		System.out.println(e);
	}
	
	
		
	}
public static void checkbalance() {
	System.out.println(bal);
	
}

	public static void main(String[] args) {
		System.out.println("enter deposit amount");
		Scanner sc=new Scanner(System.in);
		int depamount=sc.nextInt();
		
		System.out.println("enter withdraw amount");
		int withamt=sc.nextInt();

		
System.out.println("enter the choice 1:deposit 2:withdraw 3:checkbalance");
int casevalue=sc.nextInt();
switch(casevalue) {
case 1:deposit(depamount);
break;

case 2:withdraw(withamt);
break;

case 3:checkbalance();
break;
}

	}
	
}
