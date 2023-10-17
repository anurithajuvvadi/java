package java_tutorial;

public class sumnatural {

	public static void main(String[] args) {
		int i;
		int num=50;int sum=0;
		for(i = 1; i <= num; i++)  
		{  
		sum = sum + i; 
		System.out.println(sum);
		if(sum>36)
			break;
		}  
		System.out.println("Sum of First 50 Natural Numbers is = " + sum); 
	
	}

}
