/*
  * * * * *
  * * * *
  * * *
  * *
  *
*/
public class decreasingrectangle
	{
		public static void main(String[] args)
		{
			int n=5;
			for(int i=0;i<n;i++)
			{
				for(int j=i;j<n;j++)
					/*
				in the first iteration it will print 5 start bcz i is 0 and less then 5
				in the second iteration it will print 4 bcz i is 1 so it start from 1 2 3 4 
				and so on it will execute again and again untill the outer loop becomes fales
				so the outer loop execute total 5 time so inner also
				
				    */
				{
					System.out.print("*\t");
				}
				System.out.print("\n");
				
			}
			
			
		}
		
	}