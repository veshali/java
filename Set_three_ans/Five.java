import java.util.*;
class Five
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three numbers:");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a==b && b==c)
	{
		System.out.println("All are equal");
	}
	else if(a>b && a>c)
	{
		System.out.println("First Number is Largest");
	
	}
	else if(b>a && b>c)
	{
		System.out.println("Second Number is Largest");
	
	}
	else if(c>a && c>b)
	{
		System.out.println("Third Number is Largest");
	
	}
	else if(a==b && a>c)
	{
		System.out.println("First and Second Number are Largest");
	
	}
	else if(a==c && a>b)
	{
		System.out.println("First and Third Number are Largest");
	
	}
	else if(b==c && b>a)
	{
		System.out.println("Second and Third Number are Largest");
	
	}
	
}
}