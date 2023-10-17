package java_tutorial;

import java.util.Scanner;

public class validatepwd {
	public void charcheck(String p) {
		if(p.length()<10) {
			System.out.println("pwd should be atleast 10 chars");
		}
		if(p.length()>=10) {
			System.out.println("pwd is atleast 10 chars");
		}
	}
	public void digit(String s1) {
			int digit=0;
	        for (int i = 0; i < s1.length(); i++) {
	            if(Character.isDigit(s1.charAt(i))) {
	                digit++;
	                if(digit>=2) {
	                    System.out.println("valid");
	                }
	                    else {
	                    	System.out.println("invalid");
	                    }
	                    return;
	                }
	            }
		}
	        
	
	public void charordigit(String s2) {
		for (int i = 0; i < s2.length(); i++) {
		  if (!Character.isLetterOrDigit(s2.charAt(i))) {
              System.out.println("Password must contains only Lettere or Digit ");
              return;
          }
	}
	}



	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String pwd=sc.next();
validatepwd v=new validatepwd();
v.charcheck(pwd);
v.charordigit(pwd);
v.digit(pwd);

}
}
