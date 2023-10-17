package java_tutorial;

import java.util.Scanner;

public class evenoddsum {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int esum=0,ecount=0;
		int osum=0,ocount=0;
		System.out.println("enter the integers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				esum=esum+arr[i];
				ecount++;
			}
			else if(arr[i]%2!=0){
				osum=osum+arr[i];
				ocount++;
			}
		}
		System.out.println("even count is"+ecount+"odd count is:"+ocount);
		System.out.println("even sum  is"+esum+"odd sum is:"+osum);

	}

}
