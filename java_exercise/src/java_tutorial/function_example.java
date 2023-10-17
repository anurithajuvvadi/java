package java_tutorial;

public class function_example {
		 int x;
		  int y;
		  //function without return type without parameters
			public void addition()    //declaration
			{
				x=10;y=40;                //body of the function
				System.out.println("without parameter" +(x+y));
				
			}
			
			public void addition_1(int a, int b)    //declaration
			{
				x=a;
				y=b;                        //body of the function
				System.out.println("calling parameterize "+(x+y));
				
			}
		public int addition_2()    //function with return type
			{
				x=10;
				y=40;                        //body of the function
				
				int z=x+y;
				return z;
				
			}
			public int addition_3(int a,int b)    //function with return type
			{
				x=a;
				y=b;                        //body of the function
				
				int z=x+y;
				return z;
				
			}
			
			
			
			public static void main(String[] args) 
			{
				function_example f = new function_example();
				f.addition(); //calling a function
				
				f.addition_1(10,40); //calling function with parameter
				
				System.out.println("function with return type" + f.addition_2());
				
				int c =f.addition_3(10,40);
				System.out.println(c);
			}

		}
	


