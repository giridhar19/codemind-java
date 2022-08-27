import java.util.Scanner;
class Digit
{
  
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int r,n,sum=0,pro=1;
	n=sc.nextInt();
	while(n>0)
		{
			r=n%10;
			sum=sum+r;
			pro=pro*r;
            n=n/10;
        }
        System.out.print(Math.abs(pro-sum));
  }
}
