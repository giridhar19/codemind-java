import java.util.Scanner;
class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x[],n,i,k,co=0;
		n=sc.nextInt();
		x=new int[n];
		k=sc.nextInt();
		for(i=0;i<n;i++)
			x[i]=sc.nextInt();a
		for(i=0;i<n;i++)
		{
		  if(x[i]%k==0)
		    co++;
		}
		System.out.print(co);
	}
}