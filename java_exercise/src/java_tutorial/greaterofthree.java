package java_tutorial;

public class greaterofthree {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=30;
		if((x>y&&(x>z))) {
			System.out.println("x is greater");
		}
		else if((y>z)&&(y>x)) {
			System.out.println("y is greater");
		}
		else {
			System.out.println("z is greater");
		}

	}

}
