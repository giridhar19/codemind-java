import java.util.*;
class Evenarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,k,co=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]%2==0)
                co++;
        }
        if (co==n)
            System.out.print("True");
        else
            System.out.print("False");
        
    }
}