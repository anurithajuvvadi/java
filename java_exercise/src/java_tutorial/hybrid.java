package java_tutorial;
class Grandfather{
	void GFmethod() {
		System.out.println("GF method");
	}
	
}
class father extends Grandfather{
	void Fmethod() {
		System.out.println("F method");
	}
	
}
class son extends father{
	void sonmethod() {
		System.out.println("son method");
	}
	
	
}
class daughter extends father{
	void daughtermethod() {
		System.out.println("daughter method");
	}
	
	
}

public class hybrid {

	public static void main(String[] args) {
		son s=new son();
		daughter d=new daughter();
		s.sonmethod() ;
		s.Fmethod();
		d.GFmethod();
		d.daughtermethod();

	}

}
