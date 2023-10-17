package practice;

import java.io.File;
import java.io.IOException;

public class fileexample {

	public static void main(String[] args) throws IOException {
File file1=new File("f1.txt");
if(file1.createNewFile()) {
	System.out.println("file created");
}
else {
	System.out.println("file not created");
}
	}

}
