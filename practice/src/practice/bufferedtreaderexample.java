package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedtreaderexample {

	public static void main(String[] args) throws IOException {
char[] ch=new char[50];
FileReader f=new FileReader("aaa.txt");
BufferedReader b=new BufferedReader(f);
b.read(ch);
System.out.println(ch);
b.close();
f.close();



	}

}
