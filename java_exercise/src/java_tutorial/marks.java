package java_tutorial;

public class marks {
	int rollno;
	String name;
	int marks1;
	int marks2;
	int marks3;
	public marks(int r,String n) {
		rollno=r;
		name=n;
		System.out.println(rollno+"  "+name);
	}
	public void calculate(int m1,int m2,int m3){
		
		int average=(m1+m2+m3)/3;
		if(average>60) {
			System.out.println("Grade A");
		}
		else if(average>50 && average<60) {
			System.out.println("Grade b");
		}
		else {
			System.out.println("Grade c");
		}
	}	
	

	public static void main(String[] args) {
		marks obj=new marks(1,"anu");
		
		obj.calculate(10,20,30);

	}

}
