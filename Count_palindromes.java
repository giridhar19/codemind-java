import java.util.Scanner;
class count
{
    public static boolean ispalindrome(int n)
    {
        int sum=0,r,m=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if (sum==m)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,co=0,i;
        n=sc.nextInt();
        x=new int[n];
        for (i=0;i<n;i++)
            x[i]=sc.nextInt();
        for (i=0;i<n;i++)
            {
                if(ispalindrome(x[i]))
                    co++;
            }
        System.out.print(co);
    }
}