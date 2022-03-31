/*15. Write a Java program to swap two variables.  */

import java.util.Scanner;
class Ques15
{
 public static void main(String args[])
 {
   // Without variable
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number 1 : ");
   int a  =sc.nextInt();
  
   System.out.println("Enter a number 2:  ");
   int b  =sc.nextInt();
  
   a = a + b;
   b= a - b;
   a = a - b;
  
  System.out.println("Swapped number is : " + a + " and"  + b);
  
  }
}