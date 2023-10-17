package java_tutorial;
class MyException extends Exception
{
 public MyException (String message)
{ 
 super(message);
 }
 }
class definitions
{ 
public String checkAge(int age) throws MyException
{ 
if(age<15)
{
throw new MyException("Age should be above 15");
 }
else{
return "valid";
}
 }
 }
public class Source extends definitions
{
public static void main(String args[]){
 try{
 definitions d = new definitions();

 // assertEquals("valid" , String.valueOf(d.checkAge(22)));

String result = d.checkAge(5);
 System.out.println(result);
}
catch(MyException e){
System.out.println(e.getMessage());
};
 }
 }


