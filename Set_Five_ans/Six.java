import java.util.*;
class Six
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n;
	n=sc.nextInt();
	int a=1;
	for(int i=1;i<=n;i++)
	{
		a=a*i;
	}
	System.out.println("Factorial of a number: "+a);
	
	
	
	
	
}
}