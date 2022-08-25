import java.util.Scanner;
class demo5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float F,C;
		F=sc.nextInt();
		C=(float)(F-32)*5/9;
		System.out.format("%.2f",C);

	}
}