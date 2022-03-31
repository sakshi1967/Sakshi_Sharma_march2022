class Pattern10
{
 public static void main(String args [])
{
  System.out.println(" ** Printing the pattern **");
 int a=65;
 for(int i =5; i>=1;i--)
 {

   for (int j=i; j<=5; j++) 
 {
    System.out.print( " "+ (char)(a+j-1) );
 }
   
    System.out.println();
}
}
}