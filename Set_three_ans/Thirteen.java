import java.util.*;
class Thirteen
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int l,b,a,p;
	System.out.println("Enter length and breath of a triangle:");
	l=sc.nextInt();
	b=sc.nextInt();
	a=l*b;
	p=2*(l+b);
	if(a>p)
		System.out.println("Area is greater than perimeter");
	else
		System.out.println("Area is less than perimeter");
		
}
}