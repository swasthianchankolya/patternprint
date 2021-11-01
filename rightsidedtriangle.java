/*
right sided rectangele
			*
		  * *
		* * *
	  * * * *


*/
public class rightsidedrectangle
		{
			public static void main(String[] args)
			{
			 int n=5;
			 for(int i=1;i<=5;i++)
			 {
				 /*
				 this for loop will generate spaces
				 in the ecreasing order
				 */
				 for(int j=i;j<=5;j++)
				 {
					 System.out.print(" ");
				 }
				 /*
				 this loop will generate *
				 in the increasing order
				 */
				 for(int j=1;j<=i;j++)
				 {
					 System.out.print("*");
				 }
				 System.out.println("\n");
			 }
			 
			}
		}