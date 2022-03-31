class Pattern5
{
 public static void main(String args [])
{
 int a =65;
  System.out.println(" ** Printing the pattern **");
 
 for(int i =1; i<=5;i++)//Row
 {
   for (int j=1; j<=i; j++) //Column
 {
    System.out.print( " "+ (char)a );
 } 
    a++;
    System.out.println();
}
}
}