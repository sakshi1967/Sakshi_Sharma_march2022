import java.util.Scanner;
class Ques5
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number 1 : ");
  int a =sc.nextInt();
  System.out.println("Enter number 2 : ");
  int b = sc.nextInt();
  int add = a + b;
  int sub = a - b;
  int mul = a * b;
  int div = a / b ;
  System.out.println("Addition  of two number is : " +add );
  System.out.println("Substraction of two number is : " +sub);
  System.out.println("Multiplication of two number is : " +mul );
  System.out.println("Division of two number is : " +div );
 }
}