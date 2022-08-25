import java.util.Scanner;
class demo5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float F,C;
		C=sc.nextInt();
		F=(float)(C*9/5)+32;
		System.out.format("%.2f",F);

	}
}