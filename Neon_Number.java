import java.util.*;
class Coder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,m,r;
        n=sc.nextInt();
        m=n*n;
        while (m>0)
		{
			r=m%10;
			sum=sum+r;
			m=m/10;
		}
    if (n==sum)
        System.out.print("Neon Number");
    else
        System.out.print("Not Neon Number");
    }
}