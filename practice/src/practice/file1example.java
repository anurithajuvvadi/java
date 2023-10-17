package practice;

import java.io.File;

public class file1example {

	public static void main(String[] args) {
File f=new File("C:\\Users\\Saiteja\\eclipse-workspace\\practice\\src");
String[] filenames=f.list();
for(String s1:filenames) {
	System.out.println(s1);
}

	
	}

}
