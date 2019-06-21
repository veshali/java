import java.util.*;
class Six
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the side of a triangle:");
	a=sc.nextInt();
	int temp=a;
	if(a>temp)
	{
		temp=a;
	}
	System.out.println("Enter the side of a triangle:");
	b=sc.nextInt();
	if(b>temp)
	{
		temp=b;
	}
	System.out.println("Enter the side of a triangle:");
	c=sc.nextInt();
	if(c>temp)
	{
		temp=c;
	}
	
	if((a+b<temp)||(b+c<temp)||(a+c<temp))
	{
		System.out.println("The Triangle is not valid");
	}
	else
	{
		System.out.println("The Triangle is valid");
	}
	
	
}
}