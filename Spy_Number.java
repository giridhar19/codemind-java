import java.util.*;
class Spynum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n,r,sum=0,mul=1;
        n=sc.nextInt();
        while(n>0)
        {
           r=n%10;
           sum=sum+r;
           mul=mul*r;
           n=n/10;
        }
        if (sum==mul)
            System.out.print("Spy Number");
        else
            System.out.print("Not Spy Number");
        sc.close();
    }
}