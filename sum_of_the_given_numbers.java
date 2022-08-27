import java.util.Scanner;
class coder
{
    public static void main(String args[])
    {
        int t,a,b,sum=0;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            sum=a+b;
            System.out.println(sum);
            t--;
        }
    }
}