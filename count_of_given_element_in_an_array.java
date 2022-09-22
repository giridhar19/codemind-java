import java.util.*;
class oddindex
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x[],co=0,k;
        n=sc.nextInt();
        x=new int[n];
        for (i=0;i<n;i++)
            x[i]=sc.nextInt();
        k=sc.nextInt();
        for (i=0;i<n;i++)
            {
                if (x[i]==k)
                    co++;
            }
        System.out.println(co);
    }
}