import java.util.*;
class Coder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n,msum=1,sum=0,r;
        n1=sc.nextInt();
        n=n1;
        while (n>0)
		{
			r=n%10;
			for(int i=1;i<=r;i++)
			{
			    msum=msum*i;
			}
			sum=sum+msum;
			msum=1;
			n=n/10;
		}
    if (n1==sum)
        System.out.print("The number "+n1+" is a strong number");
    else
        System.out.print("The number "+n1+" is not a strong number");
    }
}