package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedreader1 {

	public static void main(String[] args) throws IOException {
InputStreamReader i=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(i);
System.out.println("enter the name");
String name=b.readLine();
System.out.println("welcome"+name);



	}

}
