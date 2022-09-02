   import java.util.*;
   class Coder
   {
     public static int sodigits(int n)
     {
       int sum=0,d;
        while(n>0)
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
       int n,res;
       n=sc.nextInt();
       if(n<0)
       n = Math.abs(n);
       res=sodigits(n);
       if (n==res)
            System.out.println("2");
        else
            System.out.println("1");
     }
   }

