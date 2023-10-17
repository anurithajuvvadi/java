package practice;

import java.io.FileWriter;
import java.io.IOException;

public class writerexample {

	public static void main(String[] args) throws IOException {
FileWriter w=new FileWriter("aaa.txt");
int i;
w.write(65)	;
w.close();


	}

}
