import java.util.*;
class comon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,sfm=0,ssm=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for (int i=1;i<=(n/2);i++)
        {
            if (n%i==0)
                sfm=sfm+i;
        }
        for (int i=1;i<=(m/2);i++)
        {
            if (m%i==0)
                ssm=ssm+i;
        }
        if (sfm==m && ssm==n)
            System.out.println("Amicable");
        else
            System.out.println("Not Amicable");
    }
}