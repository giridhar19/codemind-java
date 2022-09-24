import java.util.*;
class sample
{
    public static boolean isPrime(int n)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        if (n1==1)
            n1=2;
        for(int i=n1;i<=n2;i++)
        {
            if(isPrime(i))
                System.out.println(i);
        }
    }
}