package java_tutorial;

public class assarrays {

	public static void main(String[] args) {
String str="hellojava";
char y=str.charAt(0);
int n=str.length();
char z=str.charAt(n-1);
if((y == 'a' || y == 'e' || y == 'i' || y == 'o'
|| y == 'u')) {
	System.out.println("first is a vowel");
	
	
}
if ((z == 'a' || z == 'e' || z == 'i' || z == 'o'
|| z == 'u')) {
	System.out.println("last is a vowel");
}
else {
	System.out.println("it is a consonant");
}
	
	String s1="hello this is anuritha";
	String[] words=s1.split("\\s");
	for(String s:words) {
		System.out.println(s);
	}
	//split 
String s2="this is anuritha";
String[] word=s1.split("t");
for(String s:word) {
	System.out.println(s);
}

//tochararray
char[] ch=str.toCharArray();
int len=ch.length;
for(int i=0;i<len;i++) {
	System.out.println(ch[i]);
}
}
}