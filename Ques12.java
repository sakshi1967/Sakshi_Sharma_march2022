/*12. Write a Java program that takes three numbers as input to calculate and print the
average of the numbers.  */

import java.util.Scanner;
class Ques12
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number 1  : ");
  float num1  =sc.nextFloat();
  
   System.out.println("Enter number 2 : ");
  float num2  =sc.nextFloat();
  
   System.out.println("Enter number 3 : ");
  float num3  =sc.nextFloat();
   
   float avg  = (num1 + num2 +num3)/3;
  System.out.println("Average of three number is : " +avg);
  
  System.out.println("Average of three number is: " + (num1 + num2 +num3)/3);
  
  }
}