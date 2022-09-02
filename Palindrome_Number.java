   import java.util.*;
   class Coder
   {
     public static int sodigits(int n)
     {
       int sum=0,d;
        while(n>0 || n<0)
        {
        d=n%10;
        n=(int)n/10;
        sum=sum*10+d;
        }
     return sum;
   }
     public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
       int t,n,res;
       t=sc.nextInt();
       while(t>0)
       {
       n=sc.nextInt();
       res=sodigits(n);
       if (n==res)
            System.out.println("True");
        else
            System.out.println("False");
        t--;
     }
     }
   }