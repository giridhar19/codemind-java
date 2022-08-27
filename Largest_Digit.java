import java.util.Scanner;
class Digit
{
    public static int Largest(int n)
    {
        int r,max=0;
    	while(n>0)
		{
			r=n%10;
			if (r>max)
			    max=r;
			if (max==9)
			    return max;
            n=n/10;
        }
        return max;
    }
        
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int n,result=0;
	n=sc.nextInt();
	result=Largest(n);
	System.out.println(result);
  }
}
