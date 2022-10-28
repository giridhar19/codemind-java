import java.util.*;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n,m,sum;
        t=sc.nextInt();
        while (t>0)
        {
            n=sc.nextInt();
            m=sc.nextInt();
            sum=n+m;
            System.out.println(sum);
            t--;
        }
    }
}