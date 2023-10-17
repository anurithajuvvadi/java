package java_tutorial;
interface vehicle_one{
	public static final int speed = 250;
	void distance();
	
}
interface vehicle_two{
	public static final int time =1 ;
	void speed();
	
}
class one{
	
}
class two{
	
}
public class vehicle implements vehicle_one,vehicle_two {

	public static void main(String[] args) {
		vehicle v=new vehicle();
		v.speed();
		v.distance();
		
	
	}

	@Override
	public void speed() {
		System.out.println(speed);		
	}

	@Override
	public void distance() {
		int dist=speed*time;
		System.out.println(dist);
	}

}
