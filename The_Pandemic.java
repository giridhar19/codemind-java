import java.util.*;
class Coder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if (n<3)
            System.out.print(n-1);
        else
            System.out.print("2");
    }
}