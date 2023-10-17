package springdemo.springcoreorderexample.autowrire;

public class B {
	A a;
B(){
	System.out.println("b class");

}
public A getA() {
	return a;
	
}
public void setA(A a) {
	this.a=a;
	
}
public void display() {
	a.print();
}
}
