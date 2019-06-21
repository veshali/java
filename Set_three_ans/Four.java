import java.util.*;
class Four
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int value;
	System.out.println("Enter the day number:");
	value=sc.nextInt();
	if(value ==1)
	{
		System.out.println("Monday");
	}
	else if(value ==2)
	{
		System.out.println("Tuesday");
	}
	else if(value ==3)
	{
		System.out.println("Wednesday");
	}
	else if(value ==4)
	{
		System.out.println("Thursday");
	}
	else if(value ==5)
	{
		System.out.println("Friday");
	}
	else if(value ==6)
	{
		System.out.println("Saturday");
	}
	else
	{
		System.out.println("Sunday");
	}
	
	
}
}