///////Sum of dig of num
  import java.util.*;
  class Coder
  {
    public static int sodigits(int n)
    {
      int sum=0,pro=1,d;
    while(n>0)
    {
      d=n%10;
      n=(int)n/10;
      sum=sum+d;
    }
    return sum;
    }
     public static int prodigits(int n)
    {
      int pro=1,d;
    while(n>0)
    {
      d=n%10;
      n=(int)n/10;
      pro=pro*d;
    }
    return pro;
  }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,res,pro;
      n=sc.nextInt();
      res=sodigits(n);
      pro=prodigits(n);
      if (res==pro)
        System.out.println("Spy Number");
      else
        System.out.println("Not Spy Number");
    }
  }