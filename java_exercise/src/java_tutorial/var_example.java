package java_tutorial;

public class var_example {
	int a;
	int b;
	static int num1=0;
	public var_example(int c,int d) {
		a=c;
		b=d;
		num1++;
		System.out.println(num1);
		
	}
	public void add() {
		System.out.println(num1);

	}

	public static void main(String[] args) {
		var_example v1=new var_example(2,3);
		var_example v2=new var_example(2,3);
		v2.add();
		


	}

}
