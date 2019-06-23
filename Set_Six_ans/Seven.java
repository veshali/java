import java.util.*;
class Seven
{
public static void main(String[]args)
{

	int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	a=sc.nextInt();
	int b=a;
	int d,sum=0,rev=0;
	while(b>0)
	{
		d=b%10;
		rev=rev*10+d;
		b=b/10;
	}
	if(a==rev)
		System.out.println("Given number is Palindrome");
	else
		System.out.println("Given number is not a Palindrome");
	
	

	
}
}