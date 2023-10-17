package design_pattern;
class AA {
	private AA() {
		System.out.println("Hello");
	}
	static AA obj=new AA();
	public static AA getinstance() {
		return obj;
	}
}
public class Singleton{

	public static void main(String[] args) {
	AA obj1=AA.getinstance();

	}

}

