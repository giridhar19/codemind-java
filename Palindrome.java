import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0;
        n=sc.nextInt();
        int t=n;
        while(n>0)
         {
           int  r=n%10;
           rev=rev*10+r;
           n=n/10;
         }
         if(rev==t)
         System.out.println("True");
         else
         System.out.println("False");
    }
}