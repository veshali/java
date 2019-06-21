import java.util.*;
class Eleven
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter Three angles of a triangle");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if((a+b+c)==180)
	{
		System.out.println("Triangle is valid");
	}
	else 
	{
		System.out.println("Triangle is not valid");
	}	
}
}