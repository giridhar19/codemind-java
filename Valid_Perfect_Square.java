import java.util.*;
class comon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        double m,d;
        n=sc.nextInt();
        while(n>0)
        {
            m=sc.nextInt();
            d=Math.sqrt(m);
            if (d-((int)d)==0)
                System.out.println("True");
            else
                System.out.println("False");
            n--;
        }
    }
}