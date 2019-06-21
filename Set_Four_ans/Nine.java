import java.util.*;
class Nine
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int a,b;
	System.out.println("Enter the marks of subject A:");
	a=sc.nextInt();
	System.out.println("Enter the marks of subject B:");
	b=sc.nextInt();
	

	if(a>=55 && b>=45)
	{
		System.out.println("The Student has qualify the degree");
	}
	else if(a>=45 && a<55 && b>=55)
	{
		System.out.println("The Student has qualify the degree");
	}
	else if(a>=65 && b<45)
	{
		System.out.println("The Student has Re-appear in examination in B");
	}
	else 
	{
		System.out.println("The Student is failed");
	}
	
}
}