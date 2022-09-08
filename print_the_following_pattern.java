import java.util.*;
class pat
{
public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int r,c,k;
  r=sc.nextInt();
  k=r;
  for (int i=1; i<=r; i++) //rows
    {
      for(int j=1;j<=r;j++)   //col
      {
        System.out.print(k+" ");
        k--;
      }
      k=r;
      System.out.println();
    }
  }
}