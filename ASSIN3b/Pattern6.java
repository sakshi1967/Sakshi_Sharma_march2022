class Pattern6
{
 public static void main(String args [])
{
  System.out.println(" ** Printing the pattern **" );
  
 
for(int i =5; i>=1;i--)
 {
	 for(int j=1; j<=5-i;j++)
	 {
		 System.out.print(" ");
	 }
	 for(int j=1; j<=i; j++)
	 {
		 System.out.print("*" + " ");
	 }
    System.out.println();
}
}
}