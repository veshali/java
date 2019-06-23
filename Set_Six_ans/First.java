import java.util.*;
class First
{
public static void main(String[]args)
{

	int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	a=sc.nextInt();
	int b=a;
	int d,sum=0,rev=0;
	while(a>0)
	{
		d=a%10;
		sum=sum+d;
		a=a/10;
	}
	int temp=sum;
	System.out.println("sum: "+sum);
	while(sum>0)
	{
		d=sum%10;
		rev=rev*10+d;
		sum=sum/10;
	}
	System.out.println("reverse is:"+rev);
	int pro=rev*temp;
	if(pro==b)
		System.out.println("Given number is magic number");
	else
		System.out.println("Given number is not a magic number");
	
	

	
}
}