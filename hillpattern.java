/*
       *
	  * *
	 * * *
	* * * *
   * * * * *
#for deatiled info watch video of simply coding
youtube channel,how to slove pattern problems
*/
public class hillpattern
			{
				public static void main(String[] args)
				{
					int n=5;
					for(int i=1;i<=n;i++)
					{
						for(int j=i;j<=n;j++)
						{
							System.out.print(" ");
						}
						for(int j=1;j<i;j++)
						{
							System.out.print("*");
						}
						for(int j=1;j<=i;j++)
						{
							System.out.print("*");
						}
						System.out.println("\n");
					}
				}
			}