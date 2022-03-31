//Write a Java program that takes a number as input and prints its multiplication
//table upto 10. 

import java.util.Scanner;
class Ques7
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number : ");
  int num = sc.nextInt();
   
   for( int i=0 ; i <10 ; i++ )
   {
	   System.out.println( num + "*" + (i+1) + " =" + (num*(i+1)));
   }
  }
}
