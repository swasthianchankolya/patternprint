/*
*
* *
* * *
* * * *
* * * * *
*/
public class increasingtriangle
			{
				public static void main(String[] args)
				{
					int n=5;
					for(int i=1;i<=5;i++)
					{
						for(int j=1;j<=i;j++)
						{
							/*
							in the first loop i determines colum,
							and in second loop it start from 
							1 and its is less then or equal to i and
							one star will be printed
							and in second iteration i will be 2 and j 
							also will be 2 and conditon also 
							true so it prints 2 starts and so onnnnnn.
							
							
							*/
							System.out.print("*\t");
						}
						System.out.println("\n");
					}
				}
			}