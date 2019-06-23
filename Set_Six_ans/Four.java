import java.util.*;
class Four
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
	int ans2=sum-first-last;
	int ans1=last+first;
	if(ans1==ans2)
		System.out.println("Given number is a cool number");
	else
		System.out.println("Given number is not a cool number");
	

	
}
}