package practice;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class bufferedexample {

	public static void main(String[] args) throws IOException {
FileInputStream f=new FileInputStream("aaa.txt");
BufferedInputStream b=new BufferedInputStream(f);
int i;
while((i=b.read())!=-1) {
	System.out.print((char)i);
	
}
b.close();
f.close();

	}

}
