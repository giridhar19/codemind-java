import java.util.Scanner;
class Main
{
    public static boolean pronic(int n)
    {
        int i=(int)Math.sqrt(n);
            if(i*(i+1)==n)
                return true;
            else
                return false;
    }
    public static void main (String[] args)
    {
        int n;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        
            {
                if (pronic(n))
                    System.out.print("YES");
                else
                    System.out.print("NO");
            }
    }
}