package java_tutorial;
import java.io.*;
import java.util.*;
import java.text.*;
 import java.math.*;
 import java.util.regex.*; 
 class Mario{
 private String life;
 private String villain;
 Mario (String life, String villain){
 this.life=life;
 this.villain=villain;
 }
 
 public String getLife(){
 return life;
 }
 public void setLife(String life){
 this.life=life;
}
 public String getVillain(){
 return villain;
 }
 public void setVillain(String villain){
	 this.villain=villain;
}
 }
 class PlayMario{
 Mario mario=null;
 
PlayMario(Mario mario){
 this.mario=mario;
 }
 
 public String lifeCheck(){
 Map<Integer, String> m=new HashMap<>();
 m.put(0,"ZERO");m.put(1,"ONE");m.put(2,"TWO");
 m.put(3,"THREE");m.put(4,"FOUR");m.put(5,"FIVE");
 m.put(6,"SIX");m.put(7,"SEVEN");m.put(8,"EIGHT");
 m.put(9,"NINE");
 
 int count=0;
 String str1=mario.getLife();
 String arr[]=str1.split(" ");
 for(String s:arr){
 if(s.equals("1")){
 count++;
 }
 }
 return m.get(count);
 }
 
 public String killVillain(){
 String str=mario.getVillain();
 return str.replaceAll("[@%^]","");
  }
 
 }
 public class Source1 {
 public static void main(String args[] ) throws Exception {
 
 Mario m=new Mario("1 1 1 1 0", " Th@an%^os!_  ");
 PlayMario pm=new PlayMario(m);
 String ans=pm.lifeCheck();
 String res=pm.killVillain().trim();
 System.out.println(ans);
 System.out.println(res);
 }
 }


