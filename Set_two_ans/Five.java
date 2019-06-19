
import java.util.*;
class Five
{

public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter first angle of a triangle:");
	a=sc.nextInt();
	System.out.println("Enter second angle of a triangle:");
	b=sc.nextInt();
	c=180-(a+b);
	System.out.println("Third angle of a triangle is:"+c);
	
	
}


}