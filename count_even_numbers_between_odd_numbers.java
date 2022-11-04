import java.util.Scanner;
class fibonacci
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int x[],co=0;
     x=new int[n];
     for (int i=0;i<n;i++)
        x[i]=sc.nextInt();
     for(int i=0;i<n-1;i++)
     {
         if (((x[i]%2)!=0)&&(x[i+1]%2==0)&&(x[i+2]%2!=0))
            co++;
     }
     System.out.println(co);
   }
}
