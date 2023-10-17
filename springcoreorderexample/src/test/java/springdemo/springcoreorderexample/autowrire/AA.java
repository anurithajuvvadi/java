package springdemo.springcoreorderexample.autowrire;

public class AA {
	private static final AA obj=new AA();
	private AA() {
		
	}
	public static AA getAA() {
		System.out.println("factory method");
		return obj;
		}
public void print() {
	System.out.println("done");

}
}
