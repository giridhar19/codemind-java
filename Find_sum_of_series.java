import java.util.*;
class loop
{
  public static void main(String args[])
  {
    int n,i;
    float sum=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for (i=1; i<=n; i++)
    {
        sum=sum+(1/(float)i);
    }
    System.out.format("%.2f",sum);
    sc.close();
  }
}