import java.util.*;
class pat
{
public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int r,c,k=1;
  r=sc.nextInt();
  c=r;
  for (int i=1; i<=r; i++) //rows
    {
      for(int j=1;j<=c;j++)   //col
      {
        System.out.print((char)(64+i)+" "); 
      }
      System.out.println();
    }
  }
}