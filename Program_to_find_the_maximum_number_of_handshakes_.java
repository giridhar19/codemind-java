import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n*(n-1)/2;
        System.out.println(k);
        sc.close();
    }
}
