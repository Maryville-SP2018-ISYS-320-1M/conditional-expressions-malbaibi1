/*
 ISYS 320
 Name: Mansour Albaibi
 Date: 21-4-2018 
*/

import java.lang.*;
import java.util.Scanner;

public class P3_Consecutive {

 public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
  System.out.println("This program calculates if three input values are consecutive.");
  
  String doItAgainResponse = "";
  
  do {
   System.out.print("Enter value 1: ");
   int num1 = console.nextInt();
   System.out.print("Enter value 2: ");
   int num2 = console.nextInt();
   System.out.print("Enter value 3: ");
   int num3 = console.nextInt();
  
   System.out.printf( "a: %d, b: %d, c: %d -> ", num1, num2, num3);
   boolean numb = areConsectiveNumbers(num1,num2,num3);
   if (numb)
     System.out.println("They are consective.");
   else
     System.out.println("They are not consective.");
     
   

   
   System.out.print("Would you like to do it again (enter 'n' to quit)? ");
   doItAgainResponse = console.next();
  } while( !doItAgainResponse.equalsIgnoreCase("n"));
  
  System.out.println("Thanks!");
 }
  public static boolean areConsectiveNumbers(int a, int b, int c) {
    boolean num = false;
    int x = Math.abs(a);
    int y = Math.abs(b);
    int z = Math.abs(c);
    if((x-y==1)||(y-x==1)||(z-x==1)||(x-z==1))
      if((y-z==1)||(z-y==1)||(y-x==1)||(x-y==1))
      num =true;

  return num;
  }


}