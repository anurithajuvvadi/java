package java_tutorial;

import java.util.Scanner;

public class starpattern1 {

	public static void main(String[] args) {
  for(int i=1;i<=5;i++) {
	  for(int j=1;j<=i;j++) {
		  System.out.print("*");
	  }
	  System.out.println();
	  
  }
  
  System.out.println("second pattern");
	 
  
  for(int i=1;i<=4;i++) {
	  for(int j=1;j<=10;j++) {
		  System.out.print("*");
	  }
	  System.out.println();
  }
  
  System.out.println("third pattern");

  for (int i=1; i<=5; i++) 
  { 
      // Print space in decreasing order 
      for (int j=5; j>i; j--)
      {
          System.out.print(" ");
      }
      // Print star in increasing order
      for (int k=1; k<=(i * 2) -1; k++)
      {
          System.out.print("*");
      }
      System.out.println();
  }
  System.out.println("fourth pattern");

  for (int i=1; i<=5; i++) 
  { 
      for (int j=5; j>i; j--)
      {
          System.out.print(" ");
      }
      for (int k=1; k<=i; k++)
      {
          System.out.print("*");
      }
      System.out.println();
  }
	  }
	  }
	


