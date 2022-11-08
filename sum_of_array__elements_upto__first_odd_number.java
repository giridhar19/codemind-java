import java.util.*;
class soarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[];
        x=new int[n];
        int sum=0;
        for (int i=0;i<n;i++)
            x[i]=sc.nextInt();
        
        for (int i=0;i<n;i++)
        {
            if(((x[i])%2)==0)
                sum=sum+(x[i]);
            else
                break;
        }
        System.out.print(sum);
    }
}