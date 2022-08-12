import java.util.Scanner;
class Colour
{
	public static void main(String args[])
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.nextLine().charAt(0);
		if (ch=='V'||ch=='v')
			System.out.println("violet");
		else if (ch=='I'||ch=='i')
			System.out.println("Indigo");
		else if (ch=='b'||ch=='B')
			System.out.println("Blue");
		else if (ch=='g'||ch=='G')
			System.out.println("Green");
		else if (ch=='y'||ch=='Y')
			System.out.println("Yellow");
		else if (ch=='o'||ch=='O')
			System.out.println("Orange");
		else if (ch=='r'||ch=='R')
			System.out.println("Red");
		else
			System.out.println("-1");
		sc.close();
	}
}
		