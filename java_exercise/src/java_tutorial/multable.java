package java_tutorial;

import java.util.Scanner;

public class multable {

	public static void main(String[] args) {
		 System.out.println("enter the number between 2 and 20");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		 int i = 1;
	        while(i <= 10)
	        {
	            System.out.println( num+"*"+i+"="+ (num * i));
	            i++;
	        }
	}

}
