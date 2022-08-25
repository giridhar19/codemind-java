import java.util.*;
class Method
{
	public static int factor(int x,int y,int z)
	{
		int sum=0;
		for (int i=x; i<=y; i++)
		{
			if (i%z==0)
				sum++;
		}
		return sum;
	}
  public static void main(String args[])
  {
  	Scanner sc=new Scanner(System.in);
  	int a,b,c,result;
  	a=sc.nextInt();
  	b=sc.nextInt();
  	c=sc.nextInt();
  	result=factor(a,b,c);
  	System.out.println(result);
  }
}