package java_tutorial;

public class vowelcount {

	public static void main(String[] args) {
		String str="anu1234";
		int vcount=0;
		int ccount=0;
		 str = str.toLowerCase();    
         
	        for(int i = 0; i < str.length(); i++) {    
	            
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {     
	                vcount++;    
	            }    
	              
	            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
	                ccount++;    
	            }    
	        }
	        System.out.println("Number of vowels: " + vcount);    
	        System.out.println("Number of consonants: " + ccount);    
	  

	
int count = 0;
for (int i = 0; i < str.length(); i++) {
    if (Character.isDigit(str.charAt(i))) {
        count++;
    }
}
System.out.println(count);

	  }    
		}   
