import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,a=0,b=1,c,co=3;
        i=sc.nextInt();
        System.out.print(a+" "+b+" ");
        c=a+b;
        while(co<=i)
        {
            a=b;
            b=c;
            System.out.print(c+" ");
            c=a+b;
            co++;
        }
    }
}