import java.util.*;
class Seven
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int yr;
	System.out.println("Enter a year:");
	yr=sc.nextInt();
	if(yr%4==0)
	{
		System.out.println("given year is a leap year");
	}
	else if(yr%400==0)
	{
		System.out.println("given year is a leap year");
	}
	else if(yr%100==0)
	{
		System.out.println("given year is not a leap year");
	}
	else
	{
	System.out.println("given year is not a leap year");
	}	
	
}
}