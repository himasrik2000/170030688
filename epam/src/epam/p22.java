package epam;

public class p22 {
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.println("Please enter an integer number");
		}
		else
		{
			int a=Integer.parseInt(args[0]);
			int c=0;
			if(a==0||a==1)
			{
				System.out.println(a+"is neither prime nor composite");
			}
			else
			{
			for(int i = 2; i <= a/2; i++)
			{
				if(a % i == 0)
				{
					c++;
					
				}
			}
			if (c>=1)
			{
			System.out.println(args[0] + " is not a prime number.");
			}
			else
			{
			System.out.println(args[0] + " is  a prime number.");
			}
			
		}
	}
}
	

}
