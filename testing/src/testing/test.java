package testing;

public class test {
	public int adition(int a,int b) {
		return a+b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	 int arr[] = {10, 324, 45, 90, 9808};
   public int largest()
    {
        int i;
        int max = arr[0];
         
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
         
        return max;

}}
