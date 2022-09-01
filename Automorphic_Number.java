import java.util.Scanner;
class Coder
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,m,r,sq=0;
    n=sc.nextInt();
    m=(int)Math.log10(n)+1;
    sq=n*n;
    r=sq % (int)Math.pow(10,m);
    if (n==r)
      System .out.print("Automorphic Number");
    else
      System.out.print("Not an Automorphic Number");
    sc.close();
    
    }
  }