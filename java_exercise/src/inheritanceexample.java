class calculator{
	int x;
	int y;
	calculator(){
		x=10;
		y=20;
		}
	public void addition() {
		
		int z=x+y;
		System.out.println(z);
		}
	public void sub() {
		int z=x-y;
		System.out.println(z);
		}
}
class child extends calculator{
	child(){
		super();
		
	}
	public void mul() {
		int z=x*y;
		System.out.println(z);
		}
	public void div() {
		int z=x/y;
		System.out.println(z);
		}
}
public class inheritanceexample {

	public static void main(String[] args) {
child obj1=new child();
obj1.addition();
obj1.sub();
obj1.div();
obj1.mul();
	}

}
