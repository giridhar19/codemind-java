import java.util.*;
class loop1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int i;
    i=sc.nextInt();
    
    if (i%2==0)
     System.out.println("Even");
    else
     System.out.println("Odd");
     sc.close();
  }
}