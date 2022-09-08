import java.util.*;
class pat
{
public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int r,k;
  r=sc.nextInt();
  k=r;
  for (int i=1; i<=r; i++) //rows
    {
      for(int j=1;j<=k;j++)   //col
      {
        System.out.print((char)(64+k)+" ");
      }
      k--;
      System.out.println();
    }
  }
}