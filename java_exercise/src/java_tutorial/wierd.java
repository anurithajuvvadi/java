package java_tutorial;

import java.util.Scanner;

public class wierd {

	public static void main(String[] args) {
System.out.println("enter the number between 1 and 100");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
if(x%2!=0) {
	System.out.println("wierd");
}
else if((x%2==0)&&(x>20)) {
	System.out.println("not wierd");

}

	}

}
