import java.util.*;
class Second
{
public static void main(String[]args)
{

	int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	a=sc.nextInt();
	int b=a;
	int d,sum=0,count=0;
	while(a>0)
	{
		d=a%10;
		sum=sum+d;
		a=a/10;
		count++;
	}
	int last=b%10;
	int mul=1;
	
	for(int i=1;i<=count-1;i++)
	{
		 mul=mul*10;
	}
	int first=b/mul;
	
	int ans=sum-last-first;
		System.out.println("sum of digit except first and last digit is: "+ans);
	

	
}
}