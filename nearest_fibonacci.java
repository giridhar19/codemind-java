import java.util.Scanner;
class fibonacci
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0,b=1,c;
      c=a+b;
      while(n>c)
      {
          a=b;
          b=c;
          c=a+b;
      }
      int d1,d2;
      d1=n-b;
      d2=c-n;
      if (d1<d2)
        System.out.println(b);
      else if (d1>d2)
        System.out.println(c);
      else if (d1==d2)
        System.out.println(b+" "+c);
   }
}
