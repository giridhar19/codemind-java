import java.util.Scanner;
class DisariumDemo
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n,odd=0,even=0,r;
       n=sc.nextInt();
       while (n>0)
       {
        r=n%10;
        if (r%2==0)
            odd++;
        else
           even++; 
        n=n/10;
       }
    if (even==0)
        System.out.print("Even");
    else if (odd==0)
        System.out.print("Odd");
    else
        System.out.print("Mixed");
   }
}