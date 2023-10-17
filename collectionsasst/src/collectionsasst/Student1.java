package collectionsasst;

import java.util.ArrayList;

public class Student1 {
	ArrayList<Student> studentData()
	   { 
	    Student s1 = new Student("anuritha", 1,01); 
	    Student s2 = new Student("krithya", 2, 02 ); 
	    Student s3 = new Student("java", 3, 03); 

	    ArrayList<Student> studentlist = new ArrayList<Student>(); 

	     studentlist.add(s1); 
	     studentlist.add(s2); 
	     studentlist.add(s3); 

	     return studentlist; 

}
}
