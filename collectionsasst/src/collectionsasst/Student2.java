package collectionsasst;

import java.util.ArrayList;

public class Student2 {

	public static void main(String[] args) {
		Student1 data = new Student1(); 

		// Call studentData() method using reference variable data. 
		   ArrayList<Student> listst = data.studentData(); 

		// Now iterate and display all the Student data. 
		   for(Student st:listst)
		   { 
		     System.out.println("Student's name: " +st.name); 
		     System.out.println("Student ID " +st.id); 
		     System.out.println("Roll number: " +st.rollNo); 
		   } 
	}

}
