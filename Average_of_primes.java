import java.util.Scanner;
class count
{
	public static boolean isprime(int n)
	{
	    if(n<2)
	        return false;
	    int co=0;
	    for(int i=2;i<=(int)Math.sqrt(n);i++)
	    {
	        if(n%i==0)
	         co++;
	    }
	    if(co==0)
	        return true;
	    else
	        return false;
	}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,co=0,pr=0;
        float j;
        n=sc.nextInt();
        x=new int[n];
        for (i=0;i<n;i++)
            x[i]=sc.nextInt();
        for (i=0;i<n;i++)
        {
            if(isprime(x[i]))
            {
                pr=pr+(x[i]);
                co++;
            }
        }
        j=(float)pr/co;
        System.out.format("%.2f",j);
    }
}