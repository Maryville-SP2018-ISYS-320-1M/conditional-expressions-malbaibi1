/*
 ISYS 320
 Name: Mansour Albaibi
 Date: 21-4-2018 
*/

/*
 Your expression predictions:
 
 1. True
 2. True
 3. False
 4. True
 
 5. True
 6. False
 7. True
 8. True
   
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 1. Correct
 2. Correct
 3. Correct
 4. Correct
 
 5. Correct
 6. Correct
 7. Correct
 8. Correct
 */
public class P1_BooleanExpressions {

 public static void main(String[] args) {
  int x = 27; 
  int y = -1; 
  int z = 32; 
  boolean b = false; 
  
  System.out.println("1. " + !b);
  System.out.println("2. " + (b || true));
  System.out.println("3. " + ((x > y)&&(y > z)));
  System.out.println("4. " + ((x == y)||( x <= z)));
  System.out.println("5. " + (!(x % 2 == 0)));
  System.out.println("6. " + (b && !b));
  System.out.println("7. " + (b || !b));
  System.out.println("8. " + ((x < y) == b));
 }

}