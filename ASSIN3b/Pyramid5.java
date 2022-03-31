class Pyramid5
{
public static void main(String args [])
{
  System.out.println(" ** Printing the pattern **");
  int k=9;
 for(int i =1; i<=9;i++)
 {
	 for(int j=1; j<=9-i;j++)
	 {
		 System.out.print("  ");
	 }
	 for(int j=1; j<=i; j++)
	 {
		 System.out.print(k +" ");	
k--;		 
	 }
	 for(int j=i-i;j<=1;j++)
	 {
		 System.out.print(k+" ");
	 }
	 
    System.out.println();
}
}

}