import java.util.*;
class Seven
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the side of a triangle:");
	a=sc.nextInt();
	System.out.println("Enter the side of a triangle:");
	b=sc.nextInt();
	System.out.println("Enter the side of a triangle:");
	c=sc.nextInt();
	

	if(a==b && b==c)
	{
		System.out.println("The Triangle is Equilateral triangle");
	}
	else if(((a*a+b*b)==c*c) || ((a*a+c*c)==b*b) || ((c*c+b*b)==a*a))
	{
		System.out.println("The Triangle is Right angles triangle");
	}
	else if((a==b && (!(a==c))) || (b==c && (!(b==a))) || (a==c && (!(a==b))) ) 
	{
		System.out.println("The Triangle is Isosceles triangle");
	}
	else if(  (!(a==b && a==c))  || (!(b==c && b==a)) || (!(a==c && a==b)) ) 
	{
		System.out.println("The Triangle is Scalene triangle");
	}
	
}
}