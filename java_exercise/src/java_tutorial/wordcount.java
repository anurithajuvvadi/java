package java_tutorial;

public class wordcount {

	public static void main(String[] args) {
		String str = "Scaler by InterviewBit";
		   // character whose frequency must be determined
	           char ch = 'e';
	           // store the frequency in freq
	           int freq = 0;
          for(int j=0;j<str.length();j++) {
	           // iterate through the string
	           for(int i = 0; i < str.length(); i++) 
	           {
	               // if the specified character
	               // appears in the string
	               if(str.charAt(j) == str.charAt(i)) 
	               {
	                   // increase freq by 1
	                   ++freq;
	               }
	           }
	           
	}
          System.out.println(freq);

	}
}


