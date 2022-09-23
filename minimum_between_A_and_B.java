import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
         int a=s.nextInt();
         int b=s.nextInt();
        int sum=0;
        int min=10;
        for(int i=0;i<n;i++)
        {
         if(arr[i]>=a&&arr[i]<=b)
         {
             if( min > (arr[i]))
             {
                min=arr[i];
             }
         }
        }
        if (10>min)
            System.out.print(min);
        else
            System.out.print("-1");
        
    }
}