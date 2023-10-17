package java_tutorial;

public class smallerof4 {

	public static void main(String[] args) {
		int a=40;int b=20;int c=30;
		if (a < b) {
			if(a < c){
					System.out.println("a is Smallest");
				}
			
			if (b < a) {
				if( b < c) {
					System.out.println("Smallest is" + b);
				}
			}
			if (c < a) {
				if(c < b) {
						System.out.println("Smallest is" + c);
					}
				}
			
		}
		else {
			System.out.println("other no");
	}

}
}
