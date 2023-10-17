package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedasst {

	public static void main(String[] args)throws IOException {
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i);
		System.out.println("enter the name");
		String name=b.readLine();
		System.out.println("enter the age");
		String age=b.readLine();
		System.out.println("enter the marks");
		String marks=b.readLine();
		FileWriter fw=new FileWriter("aaa.txt");
		BufferedWriter out=new BufferedWriter(fw);
		out.write(name);
		out.append(age);
		out.append(marks);
		out.close();
		fw.close();
		b.close();

	}

}
