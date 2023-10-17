package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferwriterexample {

	public static void main(String[] args) throws IOException {
String s="hello this is java example";
FileWriter fw=new FileWriter("aaa.txt");
BufferedWriter out=new BufferedWriter(fw);
out.write(s);
out.append("hello");
out.close();
fw.close();


	}

}
