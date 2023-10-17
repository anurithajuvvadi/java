package practice;

import java.util.Scanner;

public class ifsample {
	public void meth(String s) {
		if(s.equalsIgnoreCase("TridentUdaipur")) {
			System.out.println("amount");
		}
		else {
			System.out.println("amount1");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("cost estimate");
		System.out.println("Enter the hotel u want to stay in");
		String hotelname=sc.nextLine();
		ifsample i=new ifsample();
		i.meth(hotelname);

//		System.out.println("Enter the flight u want to fly in");
//		String flightname=sc.nextLine();
//
//		System.out.println("Enter the means of transportation");
//		String transport=sc.nextLine();
//		System.out.println("hotelname: "+hotelname+" "+"flightname: "+flightname+" "+"transport: "+transport);

		
	}

}
