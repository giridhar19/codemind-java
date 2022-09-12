import java.util.*;
class Coder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int co,a=0,b=1,c;
        co=sc.nextInt();
        c=a+b;
        System.out.print(a+" "+b+" ");
        co=co-2;
        while (co>0)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
            
            co--;
        }
    }
}