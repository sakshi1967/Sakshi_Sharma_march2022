class Pattern16
{
 public static void main(String args [])
{
  System.out.println(" ** Printing the pattern **");
  
 for(int i =1; i<=5 ;i++)
 {
	 for(int j=5;j>=6-i ; j--)
	 {
		 System.out.print(" " + j ); 
	 } 
    System.out.println();
}
}
}