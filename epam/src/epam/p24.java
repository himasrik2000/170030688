package epam;

public class p24 {
	public static void main(String args[])
	{
	int a=Integer.parseInt(args[0]);
	int r,sum=0;

	while(a>0)
	{
		r=a%10;
		sum=sum+r;
		a=a/10;
		
	}
	System.out.println("sum of the digits is"+sum);

}
}
