package java_tutorial;

public class cube_static {
	static int n=2;
	public static void cube() {
		System.out.println(n*n*n);
	}

	public static void main(String[] args) {
		cube_static c=new cube_static();
		c.cube();

	}

}
