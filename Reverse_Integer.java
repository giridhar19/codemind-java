import java.util.*;
class ReverseNumber
{
	public static int findReverse(int n)
	{
		int sum=0,r;
		while (n>0)
		{
			r=n%10;
			sum=sum*10 + r;
			n=n/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,res;
		n=sc.nextInt();
		if (n<0)
		    System.out.print("-");
		n=Math.abs(n);
		res=findReverse(n);

		if(n<0)
			System.out.println("-"+res);
		else
			System.out.println(res);
	}
}