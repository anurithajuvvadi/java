package java_tutorial;

public class arraygreater {

	public static void main(String[] args) {
	int []arr= {1,2,3,4,5};
	int largest = arr[0];

    for (int num: arr) {
        if(largest < num)
            largest = num;
    }
	System.out.println(largest);

	}

}
