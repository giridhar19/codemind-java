import java.util.*;
class maximumofnumbersnotbetweenAandB
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,min,a,b,flag=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        min=999;
        for(i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
                if(x[i]<min)
                min=x[i];
                flag=1;
            }
        }
        if(flag==0)
            System.out.println(-1);
        else
            System.out.println(min);
    }
}