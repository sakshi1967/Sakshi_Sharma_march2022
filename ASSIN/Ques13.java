/*13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20  */

import java.util.Scanner;
class Ques13
{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter length of a rectangle  : ");
   float l  =sc.nextFloat();
  
   System.out.println("Enter breadth of a rectangle : ");
   float b  =sc.nextFloat();
  
   float area = (l*b);
   float perimeter= 2 *(l + b);
  
  System.out.println("Area of a rectangle is : " +area);
  System.out.println("Perimeter of a rectangle  is: " +perimeter);
  
  }
}