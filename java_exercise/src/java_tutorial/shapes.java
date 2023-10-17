package java_tutorial;
interface shape{
	void getArea();
	
}
class rectangle implements shape{
	int length=10;
	int breadth=20;
	public void getArea() {
		System.out.println(length*breadth);
		
	}
}
class circle implements shape{
	public void getArea() {
		int radius=3;
		double p=Math.PI;
		System.out.println(p*radius*radius);
		
	}
	
}
class triangle implements shape{
	
	public void getArea() {
		int base=10;
		int height=10;
		System.out.println(0.5*base*height);
		
	}
}
public class shapes {

	public static void main(String[] args) {
rectangle r=new rectangle();
circle c=new circle();
triangle t=new triangle();
r.getArea();
c.getArea();
t.getArea();



	}

}
