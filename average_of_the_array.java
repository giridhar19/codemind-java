import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        int c=0;
        float avg=(float)sum/n;
        System.out.format("%.2f",avg);
    }
}