class Pattern13
{
 public static void main(String args [])
{
  System.out.println(" ** Printing the pattern **");
 int a=65;
 for(int i =1; i<=5;i++)
 {
	 for(int j=1;j<=5-i ; j++)
	 {
		 System.out.print(" ");
	 }
   for (int j=1; j<=i; j++) 
 {
    System.out.print( " "+ (char)(a) );
 }
   a++;
    System.out.println();
}
}
}