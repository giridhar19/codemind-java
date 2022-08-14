
import java.util.Scanner;
class vowel
{
  public static void main(String args[])
    {
    int ch;
	Scanner sc=new Scanner(System.in);
	ch=sc.nextInt();
	if(ch>0)
		System.out.println("Positive Number");
	else
		System.out.println("Negative Number");
	sc.close();
    }
}