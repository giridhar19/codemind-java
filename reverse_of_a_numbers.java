import java.util.Scanner;
class Digit
{    
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	int n,x=0;
	n=sc.nextInt();
	while(n>0)
	{
		x=n%10;
		System.out.print(x);
		n=n/10;
		
	}
  }
}		
