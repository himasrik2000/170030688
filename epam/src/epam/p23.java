package epam;

public class p23 {
	public static void main(String args[])
	{
	
		int a=Integer.parseInt(args[0]);
		int temp,r,sum=0;
		temp=a;
		while(a>0)
		{
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
			
		}
		if(temp==sum)
		{
			System.out.println(args[0]+"is a palindrome.");
		}
		else
		{
			System.out.println(args[0]+"is not a palindrome");
		}
	}
	

}
