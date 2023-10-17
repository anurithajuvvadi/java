package java_tutorial;

public class string_reverse {
	public void reverse(String s) {
		String rStr = "";

		for (int i = 0; i < s.length(); i++) {
		  rStr = s.charAt(i) + rStr;
		}

		System.out.println("Reversed string: "+ rStr);

		
	}

	public static void main(String[] args) {
		string_reverse s=new string_reverse();
		s.reverse("anuritha");

	}

}
