import java.util.*;
class smallfactoials
{
    public static int small(int n)
    {
        int sum=1;
        for (int i=n;i>0;i--)
        {
            sum=sum*i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n,sum;
        t=sc.nextInt();
        while (t>0)
        {
          n=sc.nextInt();
          sum=small(n);
          System.out.println(sum);
          t--;
        }
    }
}