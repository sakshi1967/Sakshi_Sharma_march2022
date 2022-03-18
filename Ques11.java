/*11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 */

import java.util.Scanner;
class Ques11
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Radius of circle : ");
  double r  =sc.nextDouble();
  
  final double pi = 3.1415D;
  double area = (pi) *r*r;
  double perimeter = 2*(pi)*r;
  System.out.println("Area of a circle is : " +area);
  System.out.println("Perimeter of a circle is : " +perimeter);
  
  }
}