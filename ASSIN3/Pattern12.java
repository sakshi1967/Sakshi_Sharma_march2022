class Pattern12
{
 public static void main(String args [])
{
  System.out.println(" ** Printing the pattern **");
 num=5;
 for(int i =1; i<=5;i++)//Row
 {
	 for(int j=1;j<=5-i ; j++)
	 {
		 System.out.print(" ");
	 }
   for (int j=1; j<=i; j++) //Column
 {
    System.out.print( " "+ num );
 } num--;
    System.out.println();
}
}
}