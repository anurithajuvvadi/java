package java_tutorial;

public class finallyexample {

	public static void main(String[] args) {
try {
	String s=null;
	System.out.println(s.length());
		try {
			int n1=2;
			int n2=0;
			System.out.println(n1/n2);
			try {
				System.out.println(3/0);
			}
			
		
		catch(Exception e) {
			System.out.println(e);
		}
			
		}
    catch(Exception e1) {
    	System.out.println(e1);
    	
    }
	
}
catch(NullPointerException e) {
	System.out.println(e);
}
	}

}
