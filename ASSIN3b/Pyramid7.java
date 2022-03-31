class Pyramid7
{
public static void main(String args [])
{
  System.out.println(" ** Printing the pattern **");
  
 for(int i =9; i>=1;i--)
 {
	 for(int j=1; j<=9-i;j++)
	 {
		 System.out.print("  ");
	 }
	 for(int j=1; j<=i; j++)
	 {
		 System.out.print(i +" ");	 
	 }
	 for(int j=i-1;j>=1;j--)
	 {
		 System.out.print(i +" ");
	 }
    System.out.println();
}
}

}