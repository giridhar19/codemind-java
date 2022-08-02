import java.util.*;
class Main
{
    public static void main(String ards[])
    {
        int a,b;
        float avg;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        avg=(float)(a+b)/2;
        System.out.format("%.4f",avg);
    }
}