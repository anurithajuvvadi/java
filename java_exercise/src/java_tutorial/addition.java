package java_tutorial;

public class addition {
	int x,y,z;
	double e,f,g;
	String st1,st2,st3;
	addition(int a,int b,int c){
		this.x=a;
		this.y=b;
		this.z=c;
		System.out.println("sum is"+ (x+y+z));
		
		
	}
	addition(double d1,double d2,double d3){
		this.e=d1;
		this.f=d2;
		this.g=d3;
		System.out.println("sum is"+ (e+f+g));
		
		
	}
	addition(String s1,String s2,String s3){
		this.st1=s1;;
		this.st2=s2;
		this.st3=s3;
		System.out.println("sum is"+ (st1+st2+st3));
		
		
	}
	
	

	public static void main(String[] args) {
addition a1=new addition(1,2,3)	;
addition a2=new addition(1.5,2.3,3.6)	;
addition a3=new addition("hello","java","world");	;

}
	}


