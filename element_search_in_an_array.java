import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int c=s.nextInt();
        int co=0;
        for(int i=0;i<n;i++)
        {
         if (c==a[i])
         co++;
        }
        if (co>0)
            System.out.print("True");
        else
            System.out.print("False");
    }
}