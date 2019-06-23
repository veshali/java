import java.util.*;
class Nine
{
public static void main(String[]args)
{

	int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	a=sc.nextInt();
	int d,rev=0,rev2=0;
	while(a>0)
	{
		d=((a%10)+1)%10;
		rev=rev*10+d;
		a=a/10;
	}
	while(rev>0)
	{
		d=rev%10;
		rev2=rev2*10+d;
		rev=rev/10;
	}
	System.out.println("New number is: "+rev2);
	
	

	
}
}