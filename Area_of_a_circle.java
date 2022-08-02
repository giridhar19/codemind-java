import java.util.*;
class main
{
    public static void main(String args[])
    {
        int a;
        double pi=3.14,Area;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        Area=(float)pi*a*a;
        System.out.format("%.2f",Area);
    }
}