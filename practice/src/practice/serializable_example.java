package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}
public class serializable_example {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		Student s1=new Student(10,"anuritha");
		FileOutputStream fout=new FileOutputStream("aaa.txt");
		try {
			ObjectOutputStream o=new ObjectOutputStream(fout);
			o.writeObject(s1);
			
			FileInputStream fin=new FileInputStream("aaa.txt");
			ObjectInputStream o1=new ObjectInputStream(fin);
			Student s2=(Student) o1.readObject();
			System.out.println(s2.id);
			System.out.println(s2.name);
			
			
			
			
			o.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
